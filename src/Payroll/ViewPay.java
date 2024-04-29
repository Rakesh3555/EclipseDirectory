package Payroll;
import java.util.*;
public class ViewPay implements Payslip {

	@Override
	public void yourPaySlip() {
		
		// TODO Auto-generated method stub
		PayPojo pp = new PayPojo();
		UserCredPayroll uc = new UserCredPayroll();
		System.out.println("**************Pay Slip****************");
		System.out.println("Employee Name :"+pp.getUserName1());
		System.out.println("Employee Department :");
		System.out.println("Your Calculated Gross Pay :");
		System.out.println("Your Net-Pay : ");
		
	}

}
