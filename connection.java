package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class connection {

	
	public static Connection con() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/";
		String Db="student";
		
		String username="root";
		String password="avinash";
		
		Connection con=DriverManager.getConnection(url+Db,username,password);
		return con;
	}
	
}
