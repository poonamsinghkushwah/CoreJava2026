package com.pk.methods;

public class VarArgMethod {
	
	public static void marks(int...x) {
		
	 int totle = 0;	
	 
	 for(int i : x){
		 totle = totle + i;
	 }
	 System.out.println("Totle Marks="+totle);
	}
     public static void main(String[] args) {
    	 
    	 marks(10,20);  
    	 marks(10,40,10);
    	 marks(70,40,20);
     }
}
