package main;

public class TryWithoutCatchWithFinally {
public static void main(String[] args) {
	try {
		return;
	}
	finally {
		System.out.println("Finally...");
	}
}
}
