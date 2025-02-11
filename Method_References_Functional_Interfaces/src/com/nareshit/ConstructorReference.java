package com.nareshit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

record Product(Integer id, String name, Double price) {
}

interface TriFunction<T,U,E,R>{
	R myApply(T t,U u,E e);
}

public class ConstructorReference {
	public static void main(String[] args) {
      Function<Integer, Product[]> fun = Product[]::new;
      Product[] product = fun.apply(5);
      System.out.println(product.length);
      
      TriFunction<Integer,String,Double,Product> triFun = Product::new;
      product[0]=triFun.myApply(144,"Keyboard",550.98);
      product[1]=triFun.myApply(189,"Brush",50.45);
      product[2]=triFun.myApply(123,"Dry Fruit",898.99);
      product[3]=triFun.myApply(143,"Mouse",350.00);
      product[4]=triFun.myApply(156,"Sweat Shirt",849.99);

      System.out.println(Arrays.toString(product));
      Arrays.asList(product).stream().sorted(Comparator.comparingDouble(Product::price)).forEach(System.out::println);
      
      
	}
}
