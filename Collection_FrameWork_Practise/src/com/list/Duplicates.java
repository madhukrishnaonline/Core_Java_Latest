package com.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicates {
	private List<Integer> list;

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

	public Duplicates() {
	}

	public List<Integer> getDuplicatesList() {
		if (list.isEmpty()) {
			return null;
		}
		Set<Integer> distinct = new HashSet<>();
		Set<Integer> duplicatesSet = new HashSet<>();
		for (int i = 0; i < list.size(); i++) {
			if(!distinct.add(list.get(i))) {
				duplicatesSet.add(list.get(i));
			}
		}
		return new ArrayList<>(duplicatesSet);
	}
}
