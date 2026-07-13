package Busrevation;

import java.sql.*;

public class busDAO {

	public void diplayBusInfo() throws SQLException {
		String query="Select * from Bus";
		Connection con=dbconnection.getConnection();
		Statement st= con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
	while(rs.next()) {
		
		System.out.println("Bus No: "+rs.getInt(1));
		if(rs.getInt(2)==0) {
			System.out.println("AC Available :NO");
					}
		else {
			System.out.println("AC Available :YES");
		}
		System.out.println("Bus Capacity: "+rs.getInt(3));
	}
	System.out.println("-----------------------------------");
	}
	
	public int getCapacity(int id) throws SQLException {
		String query="Select capacity from bus where bus_no="+id;
		Connection con=dbconnection.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		return rs.getInt(1);
		
	}	
		
	}

