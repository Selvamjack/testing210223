package com.com;

public class Array {
	
	
	public static void main(String[] args) {
		
		//data type var[]=new datatype[length]
		
		int a[]= new int[5];
		
		a [0] = 10;
		a [1] = 20;
		a [2] = 30;
		a [3] = 40;
		a [4] = 50;
		
	int length = a.length;
	System.out.println(length); 		
				
	System.out.println(a[2]);	
		
		System.out.println("------for loop----");
		
		
	//				1		2		4	
		for (int i =0; i<a.length;i++){
	//			3	
		System.out.println(a[i]);
		
		}
		
		System.out.println("------Enchanced for loop/foreach");
		
		//data type new variable-storevariable
		
		for (int x : a) {
		
		System.out.println(x);
		}
	}

	
	
	
	
	

}
