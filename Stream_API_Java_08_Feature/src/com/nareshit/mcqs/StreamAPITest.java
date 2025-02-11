package com.nareshit.mcqs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.WeakHashMap;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;


public class StreamAPITest {
	static class Employee {
		private Integer id;
		private String name;

		public Integer getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public Employee(Integer id, String name) {
			this.id = id;
			this.name = name;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + "]";
		}
	}

	@SuppressWarnings({ "rawtypes", "removal", "unchecked" })
	public static void main(String[] args) {
		System.out.println("===============");
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		Optional<Integer> max = numbers.stream().reduce(Integer::max);
		max.ifPresent(value -> System.out.println("Max: " + value));

		System.out.println("===============");
		ArrayList<String> al = new ArrayList<String>();
		al.add("A");
		al.add("BC");
		al.add("CDE");
		al.add("DEFG");
		List<String> list = al.stream().filter(x -> x.length() >= 2).peek(x -> {
		}).collect(Collectors.toList());
		System.out.println(list);

		System.out.println("===============");
		List<Integer> al1 = new ArrayList<Integer>();
		al1.add(9);
		al1.add(10);
		al1.add(11);
		al1.add(12);
		List<Integer> list1 = al1.stream().dropWhile(x -> x <= 10).collect(Collectors.toList());
		System.out.println(list1);

		System.out.println("===============");
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(9);
		al2.add(10);
		al2.add(11);
		al2.add(12);
		List<Integer> list2 = al2.stream().takeWhile(x -> x <= 10).toList();
		System.out.println(list2);

		System.out.println("===============");
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		al3.add(-1);
		al3.add(-2);
		al3.add(-5);
		al3.add(0);
		al3.add(1);
		al3.add(2);
		List<Integer> list3 = al3.stream().skip(1).filter(y -> y <= 0).peek(x -> {
		}).collect(Collectors.toList());
		System.out.println(list3);

		System.out.println("===============");
		TreeSet<Integer> treeSet = new TreeSet<Integer>((x, y) -> y.compareTo(x));
		treeSet.add(10);
		treeSet.add(14);
		treeSet.add(13);
		System.out.println(treeSet);
		treeSet.stream().sorted(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 + o2;
			}
		}).forEach(System.out::println);

		System.out.println("===============");
		List<Integer> list4 = Arrays.asList(1, 2, 3, 4, 5);
		list4.stream().map(k -> k * 2 + 3 - k).forEach(k -> System.out.print(k + " "));

		System.out.println("\n===============");
		List<List<String>> list5 = Arrays.asList(Arrays.asList("1", "2", "3", "4", "5"));
		System.out.println(list5);
		list5.stream().flatMap(x -> list5.stream()).forEach(System.out::print);

		System.out.println("\n===============");
		List<String> words = Arrays.asList("krishna", "madhu");
		String result = words.stream().map(String::toUpperCase).reduce((s1, s2) -> s1 + s2).orElse("NULL");
		System.out.println(result);

		System.out.println("===============");
		List<Integer> list6 = List.of(2, 3, 4, 5, 6);
		list6.stream().takeWhile(x -> x >= 0).map(x -> x * 0 + 2 + 3).peek(System.out::print).toList();

		System.out.println("\n===============");
		List<Integer> list7 = List.of(54, 34, 234, 23, 364, 3);
		list7.stream().map(k -> k - k + 2).filter(k -> k != 0).map(k -> 100)
				.forEach(k -> System.out.print(k - 10 + " "));

		System.out.println("\n===============");
		Comparator<Integer> comparator = new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		};
		List<Integer> list8 = List.of(54, 34, 234, 23, 364, 3);
		list8.stream().sorted(comparator).filter(k -> k % 2 == 1).forEach(k -> System.out.print(k + " "));

		System.out.println("\n===============");
		List<Employee> list9 = List.of(new Employee(1, "John"), new Employee(5, "Ram"), new Employee(7, "Tear"),
				new Employee(4, "Jerry"), new Employee(22, "You"));
		list9.stream().limit(3).sorted((o1, o2) -> o1.getId() - o2.getId()).forEach(System.out::println);

		System.out.println("===============");
		ArrayDeque<String> de = new ArrayDeque<String>();
		de.push("well !!");
		de.push("prepare");
		System.out.println("Hi Everyone All The Best!!!");
		for (String element : de) {
			System.out.println(element);
		}

		System.out.println("===============");
		List mylist = new ArrayList();
		int[] val = { 15, 5565, 646, 233, 100 };
		for (int element : val)
			mylist.add(new Integer(element));
		System.out.println(mylist);
		Iterator iterator = mylist.iterator();
		int i = mylist.size(); // i =
		while (iterator.hasNext()) {
			Integer element = (Integer) iterator.next();
			int value = element.intValue();
			i--;
			System.out.println(value);
			if ((value < 100) || mylist.get(i).equals(100))
				iterator.remove();
		}
		System.out.println(mylist);

		System.out.println("===============");
		class demo {
			String name;
			Integer id;

			public demo(String name, Integer id) {
				this.name = name;
				this.id = id;
			}

			public String getName() {
				return name;
			}

			public Integer getId() {
				return id;
			}

			@Override
			public String toString() {
				return "demo [name=" + name + ", id=" + id + "]";
			}

			static void meth() {
				TreeMap<demo, Integer> tm = new TreeMap<>((a, b) -> a.getName().compareTo(b.getName()));
				tm.put(new demo("Hello", 01), 1);
				tm.put(new demo("zello", 05), 2);
				tm.put(new demo("Bello", 011), 3);
				tm.put(new demo("Oello", 010), 4);
				System.out.println(tm);
				WeakHashMap<demo, Integer> wm = new WeakHashMap<>(tm);
				wm.forEach(new BiConsumer<demo, Integer>() {
					public void accept(demo t, Integer u) {
						System.out.println(t.getName() + " " + t.getId() + " " + u);
					}
				});
			}
		}
		demo.meth();

	}
}
