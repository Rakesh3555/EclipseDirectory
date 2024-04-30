package Payroll;
import java.util.*;
public class ViewPay implements Payslip {
		// TODO Auto-generated method stub
			public void yourPaySlip() {
		
			
			PayPojo pp = new PayPojo();
			UserCredPayroll uc = new UserCredPayroll();
			DepartPaySel dps = new DepartPaySel();
			System.out.println("**************Pay Slip****************");
			System.out.println("Employee Name :"+pp.getUserName1());
			System.out.println("Employee Department :"+pp.getDepartment());
			System.out.println("Your Calculated Gross Pay :"+pp.getGrossPayCalci());
			System.out.println("Your Net-Pay : "+pp.getNetPayCalci());
			System.out.println("**************************************");
			}

	
	}
	
