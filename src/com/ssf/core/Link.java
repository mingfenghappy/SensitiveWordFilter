package com.ssf.core;

import java.util.List;

/**
 * @class List
 * @author lzxz1234<lzxz1234@gmail.com>
 * @version v1.0
 */
public interface Link<K, V> {

    public void put(K key, V value);
    public V get(K key);
    public int size();
    public List<V> values();
    
}
