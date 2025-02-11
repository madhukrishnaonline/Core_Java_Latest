package com.number;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumberOperations {
	public static void main(String[] args) {
		System.out.println("Even Numbers");
         List<Integer> evenNum = IntStream.rangeClosed(1, 10).boxed().filter(n->n%2==0).collect(Collectors.toList());
         System.out.println(evenNum);

         System.out.println("Odd Numbers");
         List<Integer> oddNum = IntStream.rangeClosed(1, 10).boxed().filter(n->n%2==1).collect(Collectors.toList());
         System.out.println(oddNum);

         System.out.println("Factorial Numbers");                      //1,(1,1)->1*1
         Long factorial = LongStream.rangeClosed(1, 5).reduce(1,(x,y)->x*y);
         System.out.println(factorial);
         
         System.out.println("Factor of Numbers");
         Integer factor = 15;
         List<Integer> factors = IntStream.range(1, factor).boxed().filter(num->factor%num==0).collect(Collectors.toList());
         System.out.println(factors);
         
         System.out.println("Positive or Negative Numbers");
         List<Integer> negative = IntStream.rangeClosed(-5, 10).boxed().filter(num->num<0).collect(Collectors.toList());
         System.out.println(negative);
         
         System.out.println("Sum of Natural Numbers");
         Integer n = 15;
         int sum = IntStream.rangeClosed(1,n).reduce(1,(x,y)->x+y);
         System.out.println(sum);
         
         System.out.println("Sum of Numbers");
         int sum2 = IntStream.rangeClosed(1, 10).sum();
         System.out.println(sum2);
         
         System.out.println("Prime Numbers");
         Predicate<Integer> greaterThan1 = no->no>1;
         Predicate<Integer> isPrime = no->isPrime(no); 
//         List<Integer> list = IntStream.rangeClosed(1, 20).boxed().filter(greaterThan1).filter(isPrime).collect(Collectors.toList());
         List<Integer> list = Arrays.asList(1,2,44,3,7,9,11,13,15,17,4);
         List<Integer> list2 = list.stream().filter(greaterThan1).filter(isPrime).collect(Collectors.toList());
         System.out.println(list2);
         
	}//main
	public static Boolean isPrime(Integer no) {
	    return IntStream.range(2,no/2).allMatch(num->no%num!=0);
	}
}//class