
package Payroll;

public class PayRunN {

	public static void main(String[] args) { // TODO Auto-generated method stub
		//PayrollApp pra = new PayrollApp();
		//pra.payRollCalci(); 
		UserCredPayroll ucp = new UserCredPayroll();
		ViewPay vp = new ViewPay();
		ucp.Registration();
		vp.yourPaySlip();

	}
}