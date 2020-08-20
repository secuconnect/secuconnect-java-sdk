package com.secuconnect.client.cache;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class CacheItem implements CacheItemInterface, Cloneable, Serializable {

    private final String key;

    private Object value;

    private Date expiresAt;

    private boolean isHit;

    public CacheItem(String key) {
        this.key = key;
    }

    public CacheItem clone()
    {
        CacheItem clonedItem = new CacheItem(key);
        clonedItem.value = value;
        clonedItem.expiresAt = expiresAt;
        clonedItem.isHit = isHit;

        return clonedItem;
    }

    /**
     * Returns the key for the current cache item.
     *
     * The key is loaded by the Implementing Library, but should be available to
     * the higher level callers when needed.
     *
     * @return
     *   The key string for this cache item.
     */
    public String getKey()
    {
        return key;
    }

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
    public Object get()
    {
        if (isHit()) {
            return value;
        }

        return null;
    }

    /**
     * Confirms if the cache item lookup resulted in a cache hit.
     *
     * Note: This method MUST NOT have a race condition between calling isHit()
     * and calling get().
     *
     * @return
     *   True if the request resulted in a cache hit. False otherwise.
     */
    public boolean isHit()
    {
        if (!isHit) {
            return false;
        }

        if (expiresAt == null) {
            return true;
        }

        Date currentDate = new Date();
        return currentDate.before(expiresAt);
    }

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
    public CacheItemInterface set(Object value)
    {
        this.isHit = true;
        this.value = value;

        return this;
    }

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
    public CacheItemInterface expiresAt(Date expiration)
    {
        this.expiresAt = expiration;

        return this;
    }

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
    public CacheItemInterface expiresAfter(int seconds)
    {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.SECOND, seconds);
        expiresAt = cal.getTime();

        return this;
    }
}
