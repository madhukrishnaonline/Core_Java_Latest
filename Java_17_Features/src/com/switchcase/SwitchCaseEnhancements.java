package com.switchcase;

public class SwitchCaseEnhancements {
	public static String returnName(String name) {
		return switch (name.toLowerCase()) {
		case "madhu" -> name;
		case "krishna" -> name;
		case "madhu krishna" -> name;
		default -> "UnExpected Value";
		};
	}

	Object object;
	
	/*static String formatter(Object object) {
	    return switch(object) {
	    case Integer i->"Integer "+i;
	    case String s->" String "+s;
	    case null->"Null ";
	    default->"Unknown";
	    };
	}*/
	
	/*static String formatterPatternSwitch(Object o) {
	    return switch (o) {
	        case Integer i -> String.format("int %d", i);
	        case Long l    -> String.format("long %d", l);
	        case Double d  -> String.format("double %f", d);
	        case String s  -> String.format("String %s", s);
	        default        -> o.toString();
	    };
	}*/
	
	/*public static String classifyNumber(Number num) {
	     return switch(num) {
	     case Integer i -> i%2==0?"Even Number":"Odd Number";
	     case Double d->d>0?"Positive Number":"Negative Number";
	     default->"UnKnown Number";
	     };
	}*/

	public static void main(String[] args) {
		System.out.println(returnName("madhu krishnA"));
//		Object object;
		
	}// main
}// class