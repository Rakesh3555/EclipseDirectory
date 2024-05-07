package dao;

import model.PayPojo;
import test.DepartPaySel;
import test.UserCredPayroll;
import util.payRollDb;

public class ViewPay implements Payslip{
	payRollDb prd = new payRollDb();
	public void yourPaySlip(PayPojo p) {

	
	
	UserCredPayroll uc = new UserCredPayroll();
	DepartPaySel dps = new DepartPaySel();
	System.out.println("**************Pay Slip****************");
	System.out.println("Employee Name :"+p.getUserName());
	System.out.println("Employee Department :"+p.getDepartment());
	System.out.println("Your Calculated Gross Pay :"+p.getGrossPayDisplay());
	System.out.println("Your Net-Pay : "+p.getNetPayCalci());
	System.out.println("dep : " + p.getDepartment());
	System.out.println("**************************************");
	
	
	}

}
