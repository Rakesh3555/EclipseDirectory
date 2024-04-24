package com.chainsys.day9;
import java.util.*;
public class EmployeeInfo {


	private static final float dedection = 0;
	PayrollPojo pp = new PayrollPojo();
	Scanner epi = new Scanner(System.in);



	public void employeeDetails() {

		System.out.println("GrossPay Calculator  ");

		String ValLogInUser = "[a-zA-Z0-9]{3,16}" ;

		String userName;
		System.out.println("Enter Log-in ID : ");
		userName = epi.next();
		String userPass;
		System.err.println("Enter Log-in Pass");
		userPass = epi.next();
		if(userName.matches(ValLogInUser) && userPass.matches(ValLogInUser)) {
			String empName = "[a-zA-Z]{3,16}" ;
			String employeeName;

			while(true) {
				System.out.println("Enter Employee Name :");
				employeeName = epi.next();
				if(employeeName.matches(empName)) {
					pp.setEmployeeName(employeeName);
					break;
				}
				System.out.println("Enter valid user name !");

			}

			int payHour;
			while(true) {
				System.out.println("Enter Pay/Day :");
				payHour = epi.nextInt();
				if(payHour >= 0 ) {
					pp.setPayHour(payHour);
					break;
				}
				System.out.println("Enter valid pay Hour !");
			}

			int totalHrWorked;
			while(true) {
				System.out.println("Enter Total Hours worked :");
				totalHrWorked = epi.nextInt();
				if(totalHrWorked >= 0 ) {
					pp.setTotalHrWorked(totalHrWorked);
					break;
				}
				System.out.println("Enter valid totalHrWorked !");
			}

			int overTime;
			while(true) {
				System.out.println("Enter overTime Pay/day  :");
				overTime = epi.nextInt();
				if(overTime >= 0 ) {
					pp.setOverTime(overTime);
					break;
				}
				System.out.println("Enter valid over Time !");
			}

			int totalOrTime;
			while(true) {
				System.out.println("Enter Total over time : :");
				totalOrTime = epi.nextInt();
				if(totalOrTime >= 0 ) {
					pp.setTotalOrTime(totalOrTime);
					payOut();
					break;
				}
				System.out.println("Enter valid total over Time !");
			}
			
			
		}else {
			System.out.println("Invalid user");
		}
		
		
		


	}

	public void payOut() {

		float grossPay = pp.getPayHour() * pp.getTotalHrWorked() + pp.getOverTime() * pp.getTotalOrTime();
		pp.setGrossPay(grossPay);
		
		double deduction = 0;
		double netPay = 0;
		if(grossPay < 25000) {
			netPay=grossPay - 0;
		}else if(grossPay > 25000 && grossPay < 50000) {
			deduction = grossPay * .20;
			netPay = grossPay - (grossPay * .20);
			
		}else if(grossPay > 50000 && grossPay < 100000) {
			deduction = grossPay * .25;
			netPay = grossPay - (grossPay * .25);
			
		}else if(grossPay > 100000 && grossPay < 150000) {
			deduction = grossPay * .30;
			netPay = grossPay -(grossPay * .30);
			
		}else if(grossPay > 150000){
			deduction = grossPay * .35;
			netPay = grossPay - (grossPay * .35);
			
		}else {
			System.out.println("Error");
		}
		

		System.out.println("***************Payroll***************");
		System.out.println("Employee name : "+pp.getEmployeeName());
		System.out.println("Pay/Day : "+pp.getPayHour());
		System.out.println("Totall Hours Worked :"+pp.getTotalHrWorked());
		System.err.println("Over Time : "+pp.getOverTime());
		System.out.println("Total over Time : "+pp.getTotalOrTime());
		System.out.println("---------------Pay Scale---------------");
		System.out.println("Gross Pay for "+pp.getEmployeeName()+" is "+grossPay);
		System.out.println("Net Pay for "+pp.getEmployeeName()+" is "+netPay);
		System.out.println("You have deduction of "+deduction);


	}




}

