package com.lambda;

public class IClass1 
{
      public static ITest2 work()
      {
    	   return (test)->{
                 System.out.println("IClass1.work()");
    	   };
      }
}