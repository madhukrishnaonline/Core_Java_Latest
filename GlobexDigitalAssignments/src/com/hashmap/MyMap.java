package com.hashmap;

public interface MyMap<K, V> {
	interface Entry<K, V> {
		K getKey();

		V getValue();
	}

	V put(K key, V value);

	V get(K key);

	void remove(K key);

	boolean containsKey(K key);

	int size();
}
