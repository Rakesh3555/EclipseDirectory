package Payroll;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

public class UserCredPayroll {
	
	PayPojo pp = new PayPojo();
	Scanner uc = new Scanner(System.in);
	PayrollApp pra = new PayrollApp();
	PayRollMethods prm = new PayRollMethods();
	String userPass;
	
	public void Registration() {
		System.out.println("Log-In Portal: ");
		System.out.println("1. Log-in \n 2. Sign-up ");
		
		char up = uc.next().charAt(0);
		switch(up) {
		case '1':
			pra.payRollCalci();
			break;
		
		case '2':
			while(true) {
				String gMail;
				String gMailVal = "[a-zA-Z@.]{4,16}";
				System.out.println("Enter e-mailId : ");
				gMail = uc.next();
				if(gMail.matches(gMailVal)){
					String mailOtp;
					String mailOtpVal = "[0-9]{4}";
					while(true) {
						System.out.println("Enter otp : ");
						mailOtp = uc.next();
						if(mailOtp.matches(mailOtpVal)) {
							String userName;
							String userNameVal = "[a-zA-Z]{4,16}";
							while(true) {
								System.out.println("Enter username : ");
								userName = uc.next();
								if(userName.matches(userNameVal)) {
									String userPass;
									String userPassVal = "[a-zA-Z0-9]{4,16}";
									while(true) {
										System.out.println("Enter your password :");
										userPass = uc.next();
										if(userPass.matches(userPassVal)) {
											String reUserPass;
											while(true) {
												System.out.println("Re-enter password : ");
												reUserPass = uc.next();
												if(reUserPass.equals(userPass)) {
													System.out.println("Sign-up Successfull !");
													pra.payRollCalci();
													break;
												}
												prm.write(userName, reUserPass);
											}

										}
									}
									
								}
								
							}
						}

					}
				}
			
				}
			

			}
		
		}

}
