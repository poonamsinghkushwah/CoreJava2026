package com.pk.methods;

public class Test {
	
	public static void main(String[] args) {
		
		m1(10);
		
		m1(10,20);
		
		m1(10,20,30);
	}
	public static void m1(int a) {
		
		System.out.println("m1 method with one argumen:"+" "+a);
		
	}
	
	public static void m1(int a,int b) {
		
		System.out.println("m1 method with two argument:"+" "+a+" "+b);
	}
	public static void m1(int a, int b,int c) {
		
		System.out.println("m1 method with three argument:"+a+" "+" "+b+" "+c);
	}

}
