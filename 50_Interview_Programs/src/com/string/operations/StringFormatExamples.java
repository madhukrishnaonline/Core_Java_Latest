package com.string.operations;

public class StringFormatExamples {

	public static void main(String[] args) {
        String str = "madhu";
        int age = 24;
        Float appAge = 24.5f;
        /*
         * String format = %s
         * Integer format = %d
         * Float format = %f
         * Integers HexaDecimal format = %x
         * new Line format = %n
         * % format = %%
         */
        String format = String.format("Name: %s,%nAge: %d,%nApproxAge: %.1f%n%%", str,age,appAge);
        System.out.println(format.toUpperCase());
        
        String str2 = "madhu123";
        System.out.println(str2.replace("1", "k"));
        String result = str2.replaceAll("[aeiou]", "*");
        System.out.println(result);
        System.out.println(result.replaceAll("\\d+", "#"));
        String str3 = "123";
        System.out.println(str3.matches("\\d+"));
        System.out.println(str3.chars().allMatch(Character::isDigit));
	}// main

}
