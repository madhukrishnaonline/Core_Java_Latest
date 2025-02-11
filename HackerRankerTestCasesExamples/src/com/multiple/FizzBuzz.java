package com.multiple;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          List<Integer> list = new ArrayList<Integer>();
          System.out.println("Enter Elements :: ");
          for(int i=0;i<10;i++)
          {
        	  list.add(sc.nextInt());
          }//for
          for(int i=0;i<list.size();i++)
          {
        	  if(list.get(i)%3==0 && list.get(i)%5==0)
        	  {
        		  System.out.println(list.get(i)+"- FizzBuzz");
        	  }//if
        	  else if(list.get(i)%3==0)
        	  {
        		  System.out.println(list.get(i)+"- Fizz");
        	  }//else if
        	  else if(list.get(i)%5==0)
        	  {
        		  System.out.println(list.get(i)+"- Buzz");
        	  }//else if
        	  else
        	  {
        		  System.out.println(list.get(i));
        	  }
          }//for
          sc.close();
	}//main
}//class