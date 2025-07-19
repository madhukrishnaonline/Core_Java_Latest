package com.map;

import java.util.Objects;

public class KrishnaMap<K, V> {

	static class Entry<K, V> {
		private K key;
		private V value;
		private Entry<K, V> next;

		public final K getKey() {
			return key;
		}

		public final V getValue() {
			return value;
		}

		public Entry(K key, V value) {
			this.key = key;
			this.value = value;
			this.next = null;
		}

		@Override
		public String toString() {
			return "Entry [key=" + key + ", value=" + value + ", next=" + next + "]";
		}

	}

	private Entry<K, V>[] buckets;
	private static final int INITIAL_CAPACITY = 16;

	@SuppressWarnings("unchecked")
	public KrishnaMap() {
		buckets = new Entry[INITIAL_CAPACITY];
	}

	private int getBucketOfKey(K key) {
		return Math.abs((Objects.hash(key)) % (buckets.length));
	}

	private int size = 0;

	public int size() {
		return this.size;
	}

	public V put(K key, V value) {
		int index = getBucketOfKey(key);
		Entry<K, V> existingEntry = buckets[index];
		while (existingEntry != null) {
			if (Objects.equals(key, existingEntry.getKey())) {
				V oldValue = existingEntry.getValue();
				existingEntry.value = value;
				return oldValue;
			}
			existingEntry = existingEntry.next;
		}
		Entry<K, V> newEntry = new Entry<>(key, value);
		newEntry.next = buckets[index];
		buckets[index] = newEntry;
		size++;
		return null;
	}

	public V get(K key) {
		int index = getBucketOfKey(key);
		Entry<K, V> entry = buckets[index];
		while (entry != null) {
			if (Objects.equals(key, entry.getKey())) {
				return entry.getValue();
			}
			entry = entry.next;
		}
		return null;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{");
		boolean first = true;
		for (Entry<K, V> entry : buckets) {
			Entry<K, V> current = entry;
			while (current != null) {
				if (!first) {
					builder.append(",");
				}
				builder.append(current.getKey() + "=" + current.getValue());
				first = false;
				current = current.next;
			}
		}
		builder.append("}");
		return builder.toString();
	}

	public void remove(K key) {
		int index = getBucketOfKey(key);
		Entry<K, V> entry = buckets[index];
		while (entry != null) {
			if (Objects.equals(key, entry.getKey())) {
//				entry
				size--;
				return;
			}
			entry = entry.next;
		}
	}
}