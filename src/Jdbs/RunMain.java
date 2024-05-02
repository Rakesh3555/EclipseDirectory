package Jdbs;

import java.sql.SQLException;

public class RunMain {

	static dbConnection db = new dbConnection();
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		db.cred();
		//System.out.println(getConnection());
		
	}
}
