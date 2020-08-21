package com.secuconnect.client.cache;

import java.util.concurrent.ConcurrentHashMap;

public class MemoryCache implements CacheItemPoolInterface {

    private static final ConcurrentHashMap<String, CacheItemInterface> cacheItems = new ConcurrentHashMap<>();

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

        if (hasItem(key)) {
            return cacheItems.get(key).clone();
        }

        return new CacheItem(key);
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

        return cacheItems.containsKey(key);
    }

    /**
     * Deletes all items in the pool.
     *
     * @return True if the pool was successfully cleared. False if there was an error.
     */
    public boolean clear() {
        cacheItems.clear();
        return true;
    }

    /**
     * Removes the item from the pool.
     *
     * @param key The key to delete.
     * @return True if the item was successfully removed. False if there was an error.
     */
    public boolean deleteItem(String key) throws InvalidArgumentException  {
        checkKeyName(key);
        cacheItems.remove(key);
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
        return true;
    }

    /**
     * Sets a cache item to be persisted later.
     *
     * @param item The cache item to save.
     * @return False if the item could not be queued or if a commit was attempted and failed. True otherwise.
     */
    public boolean saveDeferred(CacheItemInterface item) {
        return save(item);
    }

    /**
     * Persists any deferred cache items.
     *
     * @return True if all not-yet-saved items were successfully saved or there were none. False otherwise.
     */
    public boolean commit() {
        return true;
    }

    private void checkKeyName(String key) throws InvalidArgumentException {
        if (key == null || key.length() == 0) {
            throw new InvalidArgumentException("Invalid key name");
        }
    }
}
