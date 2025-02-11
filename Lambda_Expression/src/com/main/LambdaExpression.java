package com.main;

import com.lambda.IClass1;
import com.lambda.ITest1;
import com.lambda.ITest2;

public class LambdaExpression
{
      public static void main(String[] args) 
      {
		ITest1 itest1=  (test0)-> 
		  {
			System.out.println("LambdaExpression.main()");
		  };
		  
		  itest1.foo((itest)->{
			  System.out.println("LambdaExpression.main()");
		  });
		  
		  
		  ITest2 itest2 = IClass1.work();
		  
		  itest2.test(test0->System.out.println(itest2.getClass()));
	}//main
}//class