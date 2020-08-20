package com.secuconnect.client.cache;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class FileCache implements CacheItemPoolInterface {

    private static final ConcurrentHashMap<String, CacheItemInterface> cacheItems = new ConcurrentHashMap<>();

    private final String dir;

    public FileCache(String dir) {
        if (!dir.endsWith(File.separator)) {
            dir += File.separator;
        }

        this.dir = dir;
    }

    /**
     * Returns a Cache Item representing the specified key.
     * <p>
     * This method must always return a CacheItemInterface object, even in case of
     * a cache miss. It MUST NOT return null.
     *
     * @param key The key for which to return the corresponding Cache Item.
     * @return CacheItemInterface
     * The corresponding Cache Item.
     */
    public CacheItemInterface getItem(String key) throws InvalidArgumentException {
        checkKeyName(key);

        if (!cacheItems.containsKey(key)) {
            // load item
            Object item = null;
            try (FileInputStream file = new FileInputStream(filenameFor(key)); ObjectInputStream in = new ObjectInputStream(file)) {
                item = in.readObject();
            } catch (Exception ignored) {
            }

            if (item instanceof CacheItemInterface) {
                cacheItems.put(key, (CacheItemInterface) item);
            } else {
                // not found -> create empty item
                cacheItems.put(key, new CacheItem(key));
            }
        }

        return cacheItems.get(key).clone();
    }

    /**
     * Returns a traversable set of cache items.
     *
     * @param keys An indexed array of keys of items to retrieve.
     * @return A traversable collection of Cache Items keyed by the cache keys of
     * each item. A Cache item will be returned for each key, even if that
     * key is not found. However, if no keys are specified then an empty
     * traversable MUST be returned instead.
     */
    public CacheItemInterface[] getItems(String[] keys) throws InvalidArgumentException {
        CacheItemInterface[] list = new CacheItem[keys.length];

        for (int i = 0; i < keys.length; i++) {
            list[i] = getItem(keys[i]);
        }

        return list;
    }

    /**
     * Confirms if the cache contains specified cache item.
     * <p>
     * Note: This method MAY avoid retrieving the cached value for performance reasons.
     * This could result in a race condition with CacheItemInterface::get(). To avoid
     * such situation use CacheItemInterface::isHit() instead.
     *
     * @param key The key for which to check existence.
     * @return True if item exists in the cache, false otherwise.
     */
    public boolean hasItem(String key) throws InvalidArgumentException {
        checkKeyName(key);

        if (cacheItems.containsKey(key)) {
            return true;
        }

        return Files.exists(Paths.get(filenameFor(key)));
    }

    /**
     * Deletes all items in the pool.
     *
     * @return True if the pool was successfully cleared. False if there was an error.
     */
    public boolean clear() {
        AtomicBoolean success = new AtomicBoolean(true);

        try {
            cacheItems.clear();

            createDirectory();
            Arrays.stream(Objects.requireNonNull(new File(dir).listFiles())).forEach(
                    file -> success.set(file.delete() && success.get())
            );
        } catch (Exception ex) {
            success.set(false);
            ex.printStackTrace();
        }

        return success.get();
    }

    /**
     * Removes the item from the pool.
     *
     * @param key The key to delete.
     * @return True if the item was successfully removed. False if there was an error.
     */
    public boolean deleteItem(String key) throws InvalidArgumentException {
        checkKeyName(key);
        cacheItems.remove(key);

        try {
            File file = new File(filenameFor(key));
            if (file.exists()) {
                return file.delete();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

        return true;
    }

    /**
     * Removes multiple items from the pool.
     *
     * @param keys An array of keys that should be removed from the pool.
     * @return True if the items were successfully removed. False if there was an error.
     */
    public boolean deleteItems(String[] keys) throws InvalidArgumentException {
        boolean success = true;

        for (String key : keys) {
            success = deleteItem(key) && success;
        }

        return success;
    }

    /**
     * Persists a cache item immediately.
     *
     * @param item The cache item to save.
     * @return True if the item was successfully persisted. False if there was an error.
     */
    public boolean save(CacheItemInterface item) {
        if (!item.isHit()) {
            return false;
        }

        cacheItems.put(item.getKey(), item.clone());
        String filename = filenameFor(item.getKey());
        createFile(filename);

        boolean failed = false;
        try (FileOutputStream file = new FileOutputStream(filename); ObjectOutputStream out = new ObjectOutputStream(file)) {
            out.writeObject(item);
        } catch (Exception ex) {
            failed = true;
            ex.printStackTrace();
        }

        return !failed;
    }

    /**
     * Sets a cache item to be persisted later.
     *
     * @param item The cache item to save.
     * @return False if the item could not be queued or if a commit was attempted and failed. True otherwise.
     */
    public boolean saveDeferred(CacheItemInterface item) {
        cacheItems.put(item.getKey(), item.clone());
        return true;
    }

    /**
     * Persists any deferred cache items.
     *
     * @return True if all not-yet-saved items were successfully saved or there were none. False otherwise.
     */
    public boolean commit() {
        AtomicBoolean failed = new AtomicBoolean(false);

        Collections.list(cacheItems.keys()).forEach(key -> {
            if (save(cacheItems.get(key))) {
                cacheItems.remove(key);
            } else {
                failed.set(true);
            }
        });

        return !failed.get();
    }

    private void createFile(String filename) {
        createDirectory();
        Path path = Paths.get(filename);

        try {
            Files.createFile(path);
        } catch (FileAlreadyExistsException ignored) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String filenameFor(String key) {
        return dir + removeSpecialCharsFromKeyName(key);
    }

    private void checkKeyName(String key) throws InvalidArgumentException {
        if (key == null || key.length() == 0 || removeSpecialCharsFromKeyName(key).length() == 0) {
            throw new InvalidArgumentException("Invalid key name");
        }
    }

    private void createDirectory() {
        try {
            Files.createDirectories(Paths.get(dir));
        } catch (FileAlreadyExistsException ignored) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String removeSpecialCharsFromKeyName(String key) {
        return key.replaceAll("[\\\\/:\"*?<>|]+", "");
    }
}
