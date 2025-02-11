package com.supplier;

import java.util.function.Supplier;

public class SupplierExample 
{
	public static void main(String[] args) 
	{
            Supplier<String> supplier = ()->
            {
            	String otp = "";
            	for(int i=1;i<=6;i++)
            	{
            		otp = otp+ ((int)(Math.random()*10));
            	}
            	return otp;
            };  
            System.out.println(supplier.get());
            System.out.println(supplier.get());
            System.out.println(supplier.get());
            System.out.println(supplier.get());
            System.out.println(supplier.get());
	}
}
