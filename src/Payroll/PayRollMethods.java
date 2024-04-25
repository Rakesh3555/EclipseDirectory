package Payroll;

import java.io.FileWriter;

public class PayRollMethods {

	
	public static void write(String userName, String password) {
		try {
			FileWriter writer = new FileWriter("C:\\Users\\rake3555\\git\\repository\\demo\\src\\Payroll\\UserData.txt");
			
			String str = userName + " " + password + "\n";
			
			writer.write(str);
			writer.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
