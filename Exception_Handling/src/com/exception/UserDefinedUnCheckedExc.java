package com.exception;

import com.data.Product;

public class UserDefinedUnCheckedExc {
	public static void main(String[] args) {
        Product product = new Product();
        product.setId(2);
       getProductById(product.getId());
        
        
	}//main
	private static void getProductById(Integer id) {
		if(id==1) {
			System.out.println("Product Found..");
		}//if
		else {
			throw new NoProductFoundException("No Product Found");
		}//else
	}
}//class