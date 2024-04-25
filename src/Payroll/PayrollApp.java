package Payroll;

import java.util.*;

public class PayrollApp {

	PayPojo pp = new PayPojo();
	Scanner pps = new Scanner(System.in);
	
	public void payRollCalci(){
	while(true) {
		String VallogInUser = "[a-zA-Z]{4,16}";
		System.out.println("Enter Username : ");
		String userName = pps.next();
		System.out.println("Enter Password :");
		String passWord = pps.next();
		if(userName.matches(VallogInUser) && passWord.matches(passWord) ) {

			System.out.println("Our Services \n 1. Payroll Calci \n 2. NetPay Calci ");
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
						grossPayOutN();
						break;
					}
					System.out.println("Enter valid total over Time !");
				}
				break;

			case '2':
				double grossPayN;
				double dedection = 0;
				System.out.println("Enter Your GrossPay :");
				grossPayN = pps.nextDouble();
				if(grossPayN < 25000) {
					dedection = grossPayN - 0;
					pp.setDedection(dedection);
				}else if(grossPayN > 25000) {
					dedection = grossPayN - (grossPayN * 0.05);
					pp.setDedection(dedection);
				}else if(grossPayN > 50000) {
					dedection = grossPayN - (grossPayN * 0.08);
					pp.setDedection(dedection);
				}else if(grossPayN > 100000) {
					dedection = grossPayN - (grossPayN * 0.10);
					pp.setDedection(dedection);
				}else if(grossPayN > 150000) {
					dedection = grossPayN - (grossPayN * 0.13);
					pp.setDedection(dedection);
				}else if(grossPayN > 200000) {
					dedection = grossPayN - (grossPayN * 0.20);
					pp.setDedection(dedection);
					
				}else {
					System.out.println("Invalid entery");
				}
				netPayOut();
				
			}
			break;
		}else {
			System.out.println("Invalid user");
		}
	}
}
	    	public void grossPayOutN() {
	    		float GrossPay = pp.getPayHour() * pp.getTotalHrWorked() + pp.getOverTime() * pp.getTotalOrTime();
	    		System.out.println("Your GrossPay : "+GrossPay);
	    		
	    	}
	    	
	    	public void netPayOut() {
	    		System.out.println(pp.getDedection());
	    	}
}
