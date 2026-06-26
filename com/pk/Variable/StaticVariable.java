package com.pk.Variable;

public class StaticVariable {
	
	int x = 10;
	static int y = 20;
	
	public static void main(String[] args) {
		
	StaticVariable sv1 = new StaticVariable();
	
	sv1.x=888;
	sv1.y=999;
	
	StaticVariable sv2 = new StaticVariable();
	
	System.out.println(sv2.y+" "+sv2.x);
		
			
	
	}

}
