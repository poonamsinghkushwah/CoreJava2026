package com.pk.Array;

public class ArrayValueChange {
	
	public static void main(String[] args) {
		
		int[] a = {10,20,30};
		
		a[1] = 50;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		System.out.println("length of array:"+a.length);
	}

}
