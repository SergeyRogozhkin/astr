package org.example.astontraining.custom_hash_map;

public interface Entry<K, V> {
    K getKey();
    V getValue();
    Entry<K, V> getNext();
}
