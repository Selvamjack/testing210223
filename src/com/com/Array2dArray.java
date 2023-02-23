package com.com;

public class Array2dArray {
	
	public static void main(String[] args) {
		
		//datatype var []=new datatype[length]
		
		int a [] [] = new int [2] [2];
		
		 a [0][0]= 10;
		 a [0][1]= 20;
		 a [1][0]= 30;
		 a [1][1]= 40;
		 
		System.out.println(a[0][1]);
		System.out.println("----for loop----");
		
		//			1			2		4
		for (int i = 0; i < a.length; i++) { //row
			
			//			3.1			3.2		3.4
			for (int j = 0; j < a.length; j++) {
				
				System.out.println(a[i][j]);
			}
			
			
		}
		
		
		System.out.println("-----Enchanced for loop-----");
		
		for (int[] is : a) { //row
			
			for (int i : is) {//column
				
				System.out.println(i);
			}
		}
		
		
		
		
	}
	
	
	
	
	

}
