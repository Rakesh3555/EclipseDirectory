package com.chainsys.day2;
import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		int number;
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your number :");
		number = scanner.nextInt();
		while(number > 0) {
			number = number / 10;
			count++;
		}
		System.out.println(count);
		
		
		
		
		

	}

}
