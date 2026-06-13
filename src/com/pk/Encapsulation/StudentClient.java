package com.pk.Encapsulation;

public class StudentClient {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.setId(100);
		s1.setName("poonam");
		
		System.out.println(s1.getId());
		System.out.println(s1.getName());
	}

}
