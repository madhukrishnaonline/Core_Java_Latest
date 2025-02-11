package com.string.operations;

import java.util.Stack;

public class RemoveUnBalancedParentheses {
	private static String removeUnBalancedParentheses(String str) {
		StringBuilder builder = new StringBuilder(str);
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < builder.length(); i++) {
			if (builder.charAt(i) == '(') {
				stack.push(i);
			} // if
			else if (builder.charAt(i) == ')') {
				if (!stack.isEmpty()) {
					stack.pop();
				} // if
				else {
					builder.setCharAt(i, ' ');
				} // else
			} // else if
		} // for
		while (!stack.isEmpty()) {
			builder.setCharAt(stack.pop(), ' ');
		} // while
		return builder.toString().replaceAll(" ", "");
	}

	public static void main(String[] args) {
		String str = removeUnBalancedParentheses("((abc)(((de))");
		System.out.println(str);
	}// main

}
