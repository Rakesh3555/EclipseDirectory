package Payroll;

import java.util.Scanner;

public class DepartPaySel {
	
	Scanner dps = new Scanner(System.in);
	TesDepPay pra = new TesDepPay();
	DevDep dd = new DevDep();
	SupDep sd = new SupDep();
	PayPojo pp = new PayPojo();
	
	public void department(){
		
		System.out.println("Choose your Department :");
		System.out.println("1.Developer \n 2.Testing \n 3.Support ");
		char dc = dps.next().charAt(0);
		switch(dc) {
		case '1':
			pp.setDepartment("developer");
			dd.devDepPay();
			break;
		case '2':
			pp.setDepartment("testing");
			pra.tesDepPay();
			break;
		case '3':
			pp.setDepartment("support");
			sd.supDepPay();
			break;
		}
		
	}
}
