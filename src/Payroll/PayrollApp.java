package Payroll;

import java.util.Scanner;

public class PayrollApp {

	PayPojo pp = new PayPojo();
	Scanner pps = new Scanner(System.in);

	String VallogInUser = "[a-zA-Z]{4,16}";
	while(true) {
		System.out.println("Enter Username : ");
		String userName = pps.next();
		System.out.println("Enter Password :");
		String passWord = pps.next();
		if(userName.matches(VallogInUser) && passWord.matches(passWord) ) {

			System.out.println("Our Services \n 1. Payroll Calci \n 2. Gross Pay Calci \n 3. NetPay calci  ");
			char pa = pps.next().charAt(0);
			switch(pa) {
			case'1':
				int payHour;
				while(true) {
					System.out.println("Enter Pay/Day :");
					payHour = pps.nextInt();
					if(payHour >= 0 ) {
						pp.setPayHour(payHour);
						break;
					}
					System.out.println("Enter valid pay Hour !");
				}

				int totalHrWorked;
				while(true) {
					System.out.println("Enter Total Hours worked :");
					totalHrWorked = pps.nextInt();
					if(totalHrWorked >= 0 ) {
						pp.setTotalHrWorked(totalHrWorked);
						break;
					}
					System.out.println("Enter valid totalHrWorked !");
				}

				int overTime;
				while(true) {
					System.out.println("Enter overTime Pay/day  :");
					overTime = pps.nextInt();
					if(overTime >= 0 ) {
						pp.setOverTime(overTime);
						break;
					}
					System.out.println("Enter valid over Time !");
				}

				int totalOrTime;
				while(true) {
					System.out.println("Enter Total over time : :");
					totalOrTime = pps.nextInt();
					if(totalOrTime >= 0 ) {
						pp.setTotalOrTime(totalOrTime);
						break;
					}
					System.out.println("Enter valid total over Time !");
				}
			case '2':
				


			}
		}else {
			System.out.println("Invalid user");
		}


	}




}
