package Payroll;

import java.util.Scanner;

public class DepartPaySel {
	
	Scanner dps = new Scanner(System.in);
	TesDepPay pra = new TesDepPay();
	DevDep dd = new DevDep();
	SupDep sd = new SupDep();
	
	public void department(){
		
		System.out.println("Choose your Department :");
		System.out.println("1.Developer \n 2.Testing \n 3.Support ");
		char dc = dps.next().charAt(0);
		switch(dc) {
		case '1':
			dd.devDepPay();
			break;
		case '2':
			pra.tesDepPay();
			break;
		case '3':
			sd.supDepPay();
			break;
		}
		
	}
}
