package com.collectons;

import java.util.ArrayList;
import java.util.List;

public class FindMostConsecutiveElements {
	private static int findMaxConsecutive(List<Integer> list) {
		int max = 0;
		int currentCount = 1;
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i).equals(list.get(i - 1))) {
				currentCount++;
			} // if
			else {
				max = Math.max(max, currentCount);
				currentCount = 1;
			} // else
		} // for
		max = Math.max(max, currentCount);
		return max;
	}

	private static List<Integer> findMostConsecutive(List<Integer> list) {
		int max = 0;
		int currentCount = 1;

		List<Integer> currentSeq = new ArrayList<>();
		List<Integer> longestSeq = new ArrayList<>();

		if (list.isEmpty()) {
			return longestSeq;
		} // if
		currentSeq.add(list.get(0));
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i).equals(list.get(i - 1))) {
				currentCount++;
				currentSeq.add(list.get(i));
			} // if
			else {
				if (currentCount > max) {
					max = currentCount;
					longestSeq = new ArrayList<>(currentSeq);
				} // if
				currentSeq.clear();
				currentCount = 1;
				currentSeq.add(list.get(i));
			} // else
		} // for
		return longestSeq;
	}

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 4, 1);
		System.out.println(findMaxConsecutive(list));
		findMostConsecutive(list).forEach(System.out::println);
	}

}
