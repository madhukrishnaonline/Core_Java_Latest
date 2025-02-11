package com.optional;

import java.util.Optional;
import java.util.Scanner;

import com.user.User;

public class OptionalExample 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		User user = new User();
		System.out.println("Enter Id :: ");
		int id = scanner.nextInt();
		Optional<String> name = user.getName(id);
		if(name.isPresent())
		{
			System.out.println(name.get().toUpperCase()+", Hello!");
		}
		else
		{
			System.out.println(name.orElse("Not Found "+id));
		}
	
		
		scanner.close();
	}
}
