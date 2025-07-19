package com.student.repository;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class StudentRepositoryImpl<K, T> implements StudentRepository<K, T> {

	private final Map<K, T> map = new LinkedHashMap<>();
	private final Function<T, K> keyExtractor;

	public StudentRepositoryImpl(Function<T, K> keyExtractor) {
		this.keyExtractor = keyExtractor;
	}

	@Override
	public T save(T t) {
		K key = keyExtractor.apply(t);
		map.put(key, t);
		return map.get(key);
	}

	@Override
	public List<T> saveAll(List<T> t) {
		for (T data : t) {
			K key = keyExtractor.apply(data);
			map.put(key, data);
		}
		return t;
	}

	@Override
	public T findById(K id) {
		return map.get(id);
	}

	@Override
	public void deleteById(K id) {
		map.remove(id);

	}

	@Override
	public List<T> findAll() {
		return new LinkedList<>(map.values());
	}
}