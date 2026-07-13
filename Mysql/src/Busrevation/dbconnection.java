package Busrevation;
import java.sql.*;
public class dbconnection {

		// TODO Auto-generated method stub
		
		private static String url="jdbc:mysql://localhost:3306/busreserv";
		private static String user="root";
		private static String pass="";
		
		public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url,user,pass);

	}
}


