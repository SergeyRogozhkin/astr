package org.example.astontraining.custom_hash_map;

public class MyEntry<K, V> implements Entry<K, V> {
    private K key;
    private V value;
    private Entry<K, V> next;

    public MyEntry(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public Entry<K, V> getNext() {
        return next;
    }

    public void setNext(Entry<K, V> next) {
        this.next = next;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
