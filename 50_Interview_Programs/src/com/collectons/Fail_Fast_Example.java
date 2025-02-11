package com.collectons;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fail_Fast_Example {
	public static void main(String[] args) {
		// Map<String, Employee> map = new HashMap<>();

		Employee emp1 = new Employee(101, "Alice", "Female", 55000.00);
		Employee emp2 = new Employee(102, "Bob", "Male", 60000.00);
		Employee emp3 = new Employee(103, "Charlie", "Male", 70000.00);
		Employee emp4 = new Employee(104, "Diana", "Female", 58000.00);
		Employee emp5 = new Employee(105, "Eve", "Female", 62000.00);
//		Employee emp6 = new Employee(106, "Frank", "Male", 56000.00);

		/*	map.put("emp1", emp1);
			map.put("emp2", emp2);
			map.put("emp3", emp3);
			map.put("emp4", emp4);
			map.put("emp5", emp5);*/

		/*Iterator<String> iterator = map.keySet().iterator();
		
		while(iterator.hasNext()) {
			System.out.println(map.get(iterator.next()));
			 
			 adding an element to Map
		    exception will be thrown on next call
		    of next() method.
			map.put("emp6", emp6);
		}//while
		*/
		List<Employee> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		
		Iterator<Employee> iterator = list.iterator();
		int count =0;
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			/*	 adding an element to Map
				    exception will be thrown on next call
				    of next() method.*/
//			list.add(emp6);
			list.remove(count);
			count++;
		}
	}// main
}
