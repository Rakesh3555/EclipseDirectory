package Jdbs;

import java.security.PublicKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.ResultSetMetaData;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.mysql.cj.xdevapi.Result;

public class dbConnection {
	
	PogoDb pg = new PogoDb();
	
	public static void show() throws ClassNotFoundException, SQLException{
		Connection connection = getConnection();
		PogoDb pg = new PogoDb();
		System.out.println(connection);
		
		String query = "Select * from carsList";
		
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		ResultSet rows = preparedStatement.executeQuery();
		
		ResultSetMetaData metaData = rows.getMetaData();
		
		int cCount = metaData.getColumnCount();
		for(int i = 1 ; i <= cCount ; i+=1) {
			System.out.print(metaData.getColumnName(i) + "\t");
		}
		System.out.println();
		while(rows.next()) {
			for(int i = 1 ; i <= cCount ; i+=1) {
				System.out.print(rows.getString(i) + "\t" );
			}

		}
		
		
	}
	
	public static void insert() throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		
		String query = "insert into carsList values (02 , 'venue','white','Yes','Good')";
		PreparedStatement insertCar = connection.prepareStatement(query);
		int rows = insertCar.executeUpdate();
		
	}
	
	public static void delete(PogoDb pg) throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		
	
		String query = "delete from carsList where carNo=?";
		PreparedStatement delCar = connection.prepareStatement(query);
		
		delCar.setInt(1, pg.getsNo());
		
		int rows = delCar.executeUpdate();
		System.out.println("Rows Affected : " + rows);
	}
	
	public static void update() throws ClassNotFoundException, SQLException {
	Connection connection = getConnection();
	
		String query = "update carsList set carName = '?' where carName = '??'";
		PreparableStatement updaCar = (PreparableStatement) connection.prepareStatement(query);
		
		
	}
	public  void cred() throws ClassNotFoundException, SQLException {
		Scanner cds = new Scanner(System.in);
		userInput(pg);
		
		System.out.println("Choose your action : ");
		System.out.println("1.Insert \n2.delete \n3.update \n4.Read ");
		char cd = cds.next().charAt(0);
		switch(cd) {
		case '1':
			
			insert();
			break;
		case '2':
			delete(pg);
			break;
		case '3':
			
			break;
		case '4':
			
			break;
		}
	}
	public void userInput(PogoDb pg) {
		Scanner dbcon = new Scanner(System.in);
       	int sNo;
       	System.out.println("Enter car Number : ");
       	sNo = dbcon.nextInt();
       	pg.setsNo(sNo);
	}

	
	
		public static Connection getConnection() throws ClassNotFoundException, SQLException {
			
	        Class.forName("com.mysql.cj.jdbc.Driver");
	       	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/CarsShowroom", "root", "root");
	       	return connection;
	       	
	     
		}
	}



