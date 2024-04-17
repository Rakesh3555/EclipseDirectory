package com.chainsys.day2;

import java.util.Scanner;

public class Movie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String MovieName ;
		int NumTicket;
		char Seat;
		Scanner sn = new Scanner(System.in);
		System.out.print("Enter your movie name : ");
		MovieName = sn.nextLine();
		System.out.print("Enter number of tickets :");
		NumTicket = sn.nextInt();
		System.out.print("Your "+MovieName+" ticket for "+NumTicket+" is booked successfully");
		
		
				
		
		

	}

}
