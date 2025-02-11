package main;

import java.util.ArrayList;
import java.util.List;

public class List_Collection {
public static void main(String[] args) {
	List<String> lst = new ArrayList<>();
	lst.add("Madhu ");
	lst.add(" Krishna");
	lst.add(" Kummari");
	lst.add(" AA");
	lst.remove(3);
	System.out.println(lst);
}
}
