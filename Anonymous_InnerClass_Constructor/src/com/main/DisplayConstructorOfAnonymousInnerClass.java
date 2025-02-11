package com.main;

import java.util.Arrays;

import com.nit.ITest1;

public class DisplayConstructorOfAnonymousInnerClass 
{
	public static void main(String[] args) {
		ITest1 itest1 = new ITest1()
				{
			        @Override
			         public void multiply()
			         {
			        	 System.out.println(
								"DisplayConstructorOfAnonymousInnerClass.main(...).new ITest1() {...}.multiply()");
			         }
				};
				System.out.println("Class :: "+itest1.getClass()
				                                +"\nHashCode :: "+itest1.hashCode()
				                                +"\nconstructors ::  "+Arrays.toString(itest1.getClass().getDeclaredConstructors())
				                                +"\nInterfaces :: "+Arrays.toString(itest1.getClass().getInterfaces()));
	}//main
}//class