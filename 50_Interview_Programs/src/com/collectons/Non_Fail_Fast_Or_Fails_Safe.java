package com.collectons;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class Non_Fail_Fast_Or_Fails_Safe {

	public static void main(String[] args) {
		/*CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<Integer>(
				new Integer[] { 2, 1, 3, 4, 5, 6 });
		Iterator<Integer> iterator = copyOnWriteArrayList.iterator();
		int count = 7;
		while (iterator.hasNext()) {
			Integer next = iterator.next();
			System.out.print(next+" ");
				copyOnWriteArrayList.add(count++);
		}//while
		System.out.println("=================");
		Iterator<Integer> iterator1 = copyOnWriteArrayList.iterator();
		while (iterator1.hasNext()) {
			Integer next = iterator1.next();
			System.out.print(next+" ");
		}*/

		ConcurrentHashMap<String, Employee> map = new ConcurrentHashMap<>();
		
		Employee emp1 = new Employee(101, "Alice", "Female", 55000.00);
		Employee emp2 = new Employee(102, "Bob", "Male", 60000.00);
		Employee emp3 = new Employee(103, "Charlie", "Male", 70000.00);
		Employee emp4 = new Employee(104, "Diana", "Female", 58000.00);
		Employee emp5 = new Employee(105, "Eve", "Female", 62000.00);
		Employee emp6 = new Employee(106, "Frank", "Male", 56000.00);
		
		map.put("emp5", emp5);
		map.put("emp4", emp4);
		map.put("emp3", emp3);
		map.put("emp2", emp2);
		map.put("emp1", emp1);
		
		Iterator<String> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			Employee employee = map.get(key);
			System.out.println(key+"-"+employee);
			if (key.equalsIgnoreCase("emp5")) {
				map.put("emp6", emp6);
			} // if
		}//while
		System.out.println("================");
		Iterator<String> iterator1 = map.keySet().iterator();
		while (iterator1.hasNext()) {
			String key = iterator1.next();
			Employee employee = map.get(key);
			System.out.println(key+"-"+employee);
		}//while
		
		
		/*	ConcurrentHashMap<String, Employee> map = new ConcurrentHashMap<>();
			Employee emp1 = new Employee(101, "Alice", "Female", 55000.00);
			Employee emp2 = new Employee(102, "Bob", "Male", 60000.00);
			Employee emp5 = new Employee(105, "Eve", "Female", 62000.00);
			Employee emp6 = new Employee(106, "Frank", "Male", 56000.00);
			
			map.put("emp1", emp1);
			map.put("emp2", emp2);
			map.put("emp5", emp5);
		
			ConcurrentHashMap<String, Employee> copyMap = new ConcurrentHashMap<>();
			copyMap.putAll(map); // Create a copy of the map
		
			for (String key : copyMap.keySet()) {
			    Employee employee = copyMap.get(key);
			    System.out.println(key + " - " + employee);
			    if (key.equalsIgnoreCase("emp5")) {
			        map.put("emp6", emp6); // Modifying the original map
			    }//if
			}//for
		*/
	}// main

}
