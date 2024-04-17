package com.chainsys.day5;

public class TeenOrNot {
	public static void main(String [] args ) {

		        System.out.println(hasTeen(12, 15, 20)); 
		        System.out.println(hasTeen(20, 9, 22));  

		       
		        System.out.println(isTeen(15)); 
		        System.out.println(isTeen(12));  
		    }

		    public static boolean hasTeen(int num1, int num2, int num3) {
		        return isTeen(num1) || isTeen(num2) || isTeen(num3);
		    }

		    public static boolean isTeen(int num) {
		        return num >= 13 && num <= 19;
		    }
		}
	
	