package com.pk.methods;

public class VarArgMethodDemo1 {
	
	public static void m1(int...x) {
		
		System.out.println("Var Arg Method");
		
		int a=0;
		
		for(int i:x) {
			a = a + i;
		}
		System.out.println("Sum Of Number="+a);
	}
	
	public static void main(String[] args) {
		m1();
		m1(10);
		m1(10,20);
		m1(10,40,30);
	}

}
