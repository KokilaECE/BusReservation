package Busrevation;

import java.sql.*;
import java.util.Date;

public class bookingDAO {
	
	public int getBookedcount(int busno,Date date) throws SQLException {
		String query="Select count(passenger_name) from booking where bus_no=? and travel_date=?";
		Connection con=dbconnection.getConnection();
		PreparedStatement pst=con.prepareStatement(query);
		
		java.sql.Date sqldate=new java.sql.Date(date.getTime());
		pst.setInt(1, busno);
		pst.setDate(2, sqldate);
		
		ResultSet rs=pst.executeQuery();
		rs.next();
		return rs.getInt(1);
	}
	public void addBooking(Booking booking) throws SQLException {
		String query="Insert into booking values(?,?,?)";
		
		java.sql.Date sqlDate=new java.sql.Date(booking.date.getTime());
		Connection con=dbconnection.getConnection();
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1, booking.passengerName);
		pst.setInt(2,booking.busNo);
		pst.setDate(3,sqlDate);
		
		pst.executeUpdate();
	}

}
