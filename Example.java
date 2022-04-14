package com.masai;

import java.util.Scanner;

public class Example {
	
	static int a=10;
	int b;
	
	void sum() {
		System.out.println(a+b);
			
		
}

	
	
	public static void main(String[] args) {
		
		Example obj = new Example();
		System.out.println(Example.a);
		System.out.print("Modified value of a:");
		Example.a=5;
		System.out.println(Example.a);
		System.out.print("Value of b:");
		obj.b=20;
		System.out.println(obj.b);
		System.out.print("Sum is:");
		obj.sum();
		

	
	}
}
