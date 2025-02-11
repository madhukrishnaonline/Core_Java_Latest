package com.reference;

import com.fun.interfaces.IMethodRef;

public class UDMethodRef {

	public void oops(int x)
	{
		System.out.println("OOPS is one of high level Object Oriented Programming Language -instance");
	}//method
	
	public UDMethodRef(int x) {
		System.out.println("OOPS is one of high level Object Oriented Programming Language-con");
	}
	
	public static void oop(int x)
	{
		System.out.println("OOPS is one of high level Object Oriented Programming Language-static");
	}
	public static void main(String[] args) {
		
		UDMethodRef udRef = new UDMethodRef(22);
		System.out.println("=====================================");
		
		/*IMethodRef ref1  = (int x)->{
			
		};*/
		IMethodRef ref = udRef::oops;
		ref.java(22);
		System.out.println("Hashcode ref:: "+ref.hashCode());
		
		IMethodRef ref2 = UDMethodRef::oop;
		ref2.java(22);
		System.out.println("Hashcode ref2:: "+ref2.hashCode());
		
		IMethodRef ref3 = UDMethodRef::new;
		ref3.java(22);
		System.out.println("Hashcode ref3:: "+ref3.hashCode());
	}//main
}
