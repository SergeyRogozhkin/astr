package org.example.astontraining.custom_hash_map;

import java.util.LinkedList;

public class MyHashMap<K, V> {
    private static final int INITIAL_CAPACITY = 16;
    private LinkedList<MyEntry<K, V>>[] ll;

    public MyHashMap() {
        ll = new LinkedList[INITIAL_CAPACITY];
        for (int i = 0; i < ll.length; i++) {
            ll[i] = new LinkedList<>();
        }
    }

    private int hash(K key) {
        if (key == null) {
            return 0;
        } else {
            return key.hashCode() % ll.length;
        }
    }

    public void put(K key, V value) {
        int index = hash(key);
        LinkedList<MyEntry<K, V>> bucket = ll[index];

        for (MyEntry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }

        bucket.add(new MyEntry<>(key, value));
    }

    public V get(K key) {
        int index = hash(key);
        LinkedList<MyEntry<K, V>> bucket = ll[index];

        for (MyEntry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }

        return null;
    }

    public void remove(K key) {
        int index = hash(key);
        LinkedList<MyEntry<K, V>> bucket = ll[index];

        for (MyEntry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                bucket.remove(entry);
                return;
            }
        }
    }

    public void printMap() {
        for (int i = 0; i < ll.length; i++) {
            LinkedList<MyEntry<K, V>> bucket = ll[i];
            if (!bucket.isEmpty()) {
                for (MyEntry<K, V> entry : bucket) {
                    System.out.println("Key {" + entry.getKey() + "} Value {" + entry.getValue()+"}");
                }
            }
        }
    }
}

