package com.secuconnect.client.cache;

/**
 * CacheItemPoolInterface generates CacheItemInterface objects.
 *
 * The primary purpose of Cache\CacheItemPoolInterface is to accept a key from
 * the Calling Library and return the associated Cache\CacheItemInterface object.
 * It is also the primary point of interaction with the entire cache collection.
 * All configuration and initialization of the Pool is left up to an
 * Implementing Library.
 */
public interface CacheItemPoolInterface {

    /**
     * Returns a Cache Item representing the specified key.
     *
     * This method must always return a CacheItemInterface object, even in case of
     * a cache miss. It MUST NOT return null.
     *
     * @param key
     *   The key for which to return the corresponding Cache Item.
     *
     * @return CacheItemInterface
     *   The corresponding Cache Item.
     */
    CacheItemInterface getItem(String key) throws InvalidArgumentException;

    /**
     * Returns a traversable set of cache items.
     *
     * @param keys
     *   An indexed array of keys of items to retrieve.
     *
     * @return
     *   A traversable collection of Cache Items keyed by the cache keys of
     *   each item. A Cache item will be returned for each key, even if that
     *   key is not found. However, if no keys are specified then an empty
     *   traversable MUST be returned instead.
     */
    CacheItemInterface[] getItems(String[] keys) throws InvalidArgumentException;

    /**
     * Confirms if the cache contains specified cache item.
     *
     * Note: This method MAY avoid retrieving the cached value for performance reasons.
     * This could result in a race condition with CacheItemInterface::get(). To avoid
     * such situation use CacheItemInterface::isHit() instead.
     *
     * @param key
     *   The key for which to check existence.
     *
     * @return
     *   True if item exists in the cache, false otherwise.
     */
    boolean hasItem(String key) throws InvalidArgumentException;

    /**
     * Deletes all items in the pool.
     *
     * @return
     *   True if the pool was successfully cleared. False if there was an error.
     */
    boolean clear();

    /**
     * Removes the item from the pool.
     *
     * @param key
     *   The key to delete.
     *
     * @return
     *   True if the item was successfully removed. False if there was an error.
     */
    boolean deleteItem(String key) throws InvalidArgumentException;

    /**
     * Removes multiple items from the pool.
     *
     * @param keys
     *   An array of keys that should be removed from the pool.
     *
     * @return
     *   True if the items were successfully removed. False if there was an error.
     */
    boolean deleteItems(String[] keys);

    /**
     * Persists a cache item immediately.
     *
     * @param item
     *   The cache item to save.
     *
     * @return
     *   True if the item was successfully persisted. False if there was an error.
     */
    boolean save(CacheItemInterface item);

    /**
     * Sets a cache item to be persisted later.
     *
     * @param item
     *   The cache item to save.
     *
     * @return
     *   False if the item could not be queued or if a commit was attempted and failed. True otherwise.
     */
    boolean saveDeferred(CacheItemInterface item);

    /**
     * Persists any deferred cache items.
     *
     * @return
     *   True if all not-yet-saved items were successfully saved or there were none. False otherwise.
     */
    boolean commit();
}
