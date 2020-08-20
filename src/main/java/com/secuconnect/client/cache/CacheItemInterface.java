package com.secuconnect.client.cache;

import java.util.Date;

public interface CacheItemInterface extends Cloneable {

    /**
     * Returns the key for the current cache item.
     *
     * The key is loaded by the Implementing Library, but should be available to
     * the higher level callers when needed.
     *
     * @return
     *   The key string for this cache item.
     */
    String getKey();

    /**
     * Retrieves the value of the item from the cache associated with this object's key.
     *
     * The value returned must be identical to the value originally stored by set().
     *
     * If isHit() returns false, this method MUST return null. Note that null
     * is a legitimate cached value, so the isHit() method SHOULD be used to
     * differentiate between "null value was found" and "no value was found."
     *
     * @return
     *   The value corresponding to this cache item's key, or null if not found.
     */
    Object get();

    /**
     * Confirms if the cache item lookup resulted in a cache hit.
     *
     * Note: This method MUST NOT have a race condition between calling isHit()
     * and calling get().
     *
     * @return
     *   True if the request resulted in a cache hit. False otherwise.
     */
    boolean isHit();

    CacheItemInterface clone();

    /**
     * Sets the value represented by this cache item.
     *
     * The $value argument may be any item that can be serialized by PHP,
     * although the method of serialization is left up to the Implementing
     * Library.
     *
     * @param value
     *   The serializable value to be stored.
     *
     * @return
     *   The invoked object.
     */
    CacheItemInterface set(Object value);

    /**
     * Sets the expiration time for this cache item.
     *
     * @param expiration
     *   The point in time after which the item MUST be considered expired.
     *   If null is passed explicitly, a default value MAY be used. If none is set,
     *   the value should be stored permanently or for as long as the
     *   implementation allows.
     *
     * @return
     *   The called object.
     */
    CacheItemInterface expiresAt(Date expiration);

    /**
     * Sets the expiration time for this cache item.
     *
     * @param seconds
     *   The period of time from the present after which the item MUST be considered
     *   expired. An integer parameter is understood to be the time in seconds until
     *   expiration. If null is passed explicitly, a default value MAY be used.
     *   If none is set, the value should be stored permanently or for as long as the
     *   implementation allows.
     *
     * @return
     *   The called object.
     */
    CacheItemInterface expiresAfter(int seconds);

}
