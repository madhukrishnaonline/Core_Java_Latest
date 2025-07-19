package com.student.repository;

import java.util.List;

public interface StudentRepository<K, T> {
	T save(T t);

	List<T> saveAll(List<T> t);

	T findById(K id);

	void deleteById(K id);

	List<T> findAll();
}