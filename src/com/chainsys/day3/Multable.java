package com.chainsys.day3;
import java.util.Scanner;

public class Multable {

	public static void main(String[] args) {
	Scanner mt = new Scanner(System.in);
	int num ;
	System.out.print("Enter your Number :");
	num = mt.nextInt();
	for (int i = 1; i <= 10; ++i) {
		System.out.printf("%d * %d = %d%n", num, i, num * i);
		}
	 }
}


