package testJdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		
		String jdbcURL = "jdbc:mysql://localhost:3306/stage?useSSL=false";
		String user = "alessio";
		String pass = "alessio";
		
		
		try {
			
			Connection con = DriverManager.getConnection(jdbcURL, user, pass);
			
			System.out.println("funziona");
			
		}
		catch ( Exception exc) {
			exc.printStackTrace();
		}
	}

}
