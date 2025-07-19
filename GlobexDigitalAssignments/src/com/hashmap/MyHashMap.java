package com.hashmap;

import java.util.Objects;

@SuppressWarnings("unchecked")
public class MyHashMap<K, V> implements MyMap<K, V> {
	private int size = 0;

	static class Entry<K, V> {
		private K key;
		private V value;
		private Entry<K, V> next;

		public Entry(K key, V value) {
			this.key = key;
			this.value = value;
		}

		public final K getKey() {
			return key;
		}

		public final V getValue() {
			return value;
		}

		@Override
		public String toString() {
			return "Entry [key=" + key + ", value=" + value + ", next=" + next + "]";
		}
	}

	private final float LOAD_FACTOR = 0.75f;
	@SuppressWarnings("unused")
	private int threshold;

	private final int INITIAL_CAPACITY = 16;

	private Entry<K, V>[] buckets;

	public MyHashMap() {
		buckets = new Entry[INITIAL_CAPACITY];
		threshold = (int) (INITIAL_CAPACITY * LOAD_FACTOR);
	}

	public MyHashMap(int capacity) {
		buckets = new Entry[capacity];
		threshold = (int) (capacity * LOAD_FACTOR);
	}

	@SuppressWarnings("unused")
	private void reSize() {
		int newCapacity = buckets.length * 2;
	}

	private int getBucketIndex(K key) {
		return Math.abs(Objects.hashCode(key)) % buckets.length;
	}

	@Override
	public V put(K key, V value) {
		int index = getBucketIndex(key);
		Entry<K, V> existingEntry = buckets[index];

		while (existingEntry != null) {
			if (Objects.equals(existingEntry.key, key)) {
				V oldValue = existingEntry.value;
				existingEntry.value = value;
				return oldValue;
			}
			existingEntry = existingEntry.next;
		} // if

		Entry<K, V> newEntry = new Entry<>(key, value);
		newEntry.next = buckets[index];
		buckets[index] = newEntry;
		size++;
		return null;
	}

	public V get(K key) {
		int index = getBucketIndex(key);
		Entry<K, V> currentEntry = buckets[index];

		while (currentEntry != null) {
			if (Objects.equals(currentEntry.key, key)) {
				return currentEntry.value;
			}
			currentEntry = currentEntry.next;
		}
		return null;// key not found
	}

	public void remove(K key) {
		int index = getBucketIndex(key);
		Entry<K, V> currentEntry = buckets[index];
		Entry<K, V> previousEntry = null;
		while (currentEntry != null) {
			if (Objects.equals(currentEntry.key, key)) {
				if (previousEntry == null) {
					buckets[index] = currentEntry.next;
				} else {
					previousEntry.next = currentEntry.next;
				}
				size--;
				return;
			}
			previousEntry = currentEntry;
			currentEntry = currentEntry.next;
		} // while
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{");
		boolean first = true;
		for (Entry<K, V> bucket : buckets) {
			Entry<K, V> current = bucket;
			while (current != null) {
				if (!first) {
					builder.append(",");
				}
				builder.append(current.getKey()).append("=").append(current.getValue());
				first = false;
				current = current.next;
			}
		}
		builder.append("}");
		return builder.toString();
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean containsKey(K key) {
		int index = getBucketIndex(key);
		Entry<K, V> current = buckets[index];
		while (current != null) {
			if (Objects.equals(current.key, key)) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	public int size() {
		return size;
	}
}