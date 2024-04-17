package com.chainsys.day5;

public class PatternPrinting {

	public static void main(String[] args) {
		// Pattern a
		System.out.println("Pattern a :");
		System.out.println("");
		for (int i = 1; i <= 4; i++) {
		    for (int j = 1; j <= i; j++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		// Pattern b
		System.out.println("Pattern b :");
		System.out.println("");
		for (int i = 1; i <= 3; i++) {
		    for (int j = 1; j <= 3 - i; j++) {
		        System.out.print(" ");
		    }
		    for (int k = 1; k <= 2 * i - 1; k++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		for (int i = 2; i >= 1; i--) {
		    for (int j = 1; j <= 3 - i; j++) {
		        System.out.print(" ");
		    }
		    for (int k = 1; k <= 2 * i - 1; k++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		// Pattern c
		System.out.println("Pattern a :");
		System.out.println("");
		int n = 4;

	
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for (int k = 0; k < n - i; k++) {
				System.out.print("1");
				if (k < n - i - 1) {
					System.out.print("0");
				}
			}
			System.out.println(); 
		}
	}
}

