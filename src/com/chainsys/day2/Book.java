package com.chainsys.day2;

import java.util.Scanner;

public class Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String BookName ;
				String AurthorName;
				int Pages;
				Scanner sb = new Scanner(System.in);
				System.out.print("Enter your Book name : ");
				BookName = sb.nextLine();
				System.out.print("Aurthor Name :");
				AurthorName = sb.nextLine();
				System.out.print("No. of pages :");
				Pages = sb.nextInt();
				System.out.println(BookName+" is written by "+AurthorName+" has "+Pages+" pages.");		
	}

}
