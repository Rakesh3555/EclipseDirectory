package Payroll;

import java.util.Scanner;

public class UserCredPayroll {
	
	PayPojo pp = new PayPojo();
	Scanner uc = new Scanner(System.in);
	 DepartPaySel dp=new  DepartPaySel();
	PayRollMethods prm = new PayRollMethods();
	String userPass;
	
	public void Registration() {
		System.out.println("Log-In Portal: ");
		System.out.println("1. Log-in \n2. Sign-up ");
		System.out.println("If you have an account Log-in or choose 2 to Sign-up.");
		char up = uc.next().charAt(0);
		switch(up) {
		case '1':
			dp.department();
			break;
		
		case '2':
			while(true) {
				String gMail;
				String gMailVal = "[a-z@.]{4,16}";
				System.out.println("Enter e-mailId : ");
				gMail = uc.next();
				if(gMail.matches(gMailVal)){
					String mailOtp="";
					String mailOtpVal = "[0-9]{4}";
					while(!mailOtp.matches(mailOtpVal)) {
						System.out.println("Enter otp : ");
						mailOtp = uc.next();
						if(mailOtp.matches(mailOtpVal)) {
							String userName="";
							String userNameVal = "[a-zA-Z]{4,16}";
							while(!userName.matches(userNameVal)) {
								System.out.println("Enter username1 : ");
								userName = uc.next();
								if(userName.matches(userNameVal)) {
									String userPass="";
									String userPassVal = "[a-zA-Z0-9]{4,16}";
									while(!userPass.matches(userPassVal)) {
										System.out.println("Enter your password1 :");
										userPass = uc.next();
										if(userPass.matches(userPassVal)) {
											String reUserPass="";
											while(!reUserPass.equals(userPass)) {
												System.out.println("Re-enter password : ");
												reUserPass = uc.next();
												if(reUserPass.equals(userPass)) {
													System.out.println("Sign-up Successfull !");
													prm.write(userName, reUserPass);
													
													break;
												}
												
											}

										}
									
									}
									
								}
	
							
							}
						}

					}
				}
				break;
			}
			
			dp.department();

	}
		
		
		
		}
	
}
