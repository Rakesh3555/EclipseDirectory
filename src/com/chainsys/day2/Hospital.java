package com.chainsys.day2;

import java.util.Scanner;

public class Hospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String PatientName ;
		String Cause ;
		int BedNumber;
		Scanner sh = new Scanner(System.in);
		System.out.print("Enter Patient Name : ");
		PatientName = sh.nextLine();
		System.out.print("Reason for admission : ");
		Cause = sh.nextLine();
		System.out.print("Enter bed number : ");
		BedNumber = sh.nextInt();
		System.out.println(PatientName+" is admited for" +Cause+" in bed "+BedNumber);

	}

}
