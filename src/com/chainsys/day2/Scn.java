
package com.chainsys.day2;
import java.util.Scanner;
public class Scn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name :");
		String name = scanner.nextLine();
		System.out.print("Enter your age :");
		int age = scanner.nextInt();
		
		if (age > 18) {
			System.out.println("You are eligible");
		}
		else {
			System.out.println("You are not eligible");
		}
		
		

	}

}
