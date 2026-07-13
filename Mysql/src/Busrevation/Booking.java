package Busrevation;
import java.util.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
	String passengerName;
	int busNo;
	Date date;
	Booking(){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Passenger Name:");
		passengerName=sc.nextLine();
		System.out.println("Enter Bus No: ");
		busNo=sc.nextInt();
		System.out.println("Enter date DD-MM-YYYY");
		String dateInput=sc.next();
		SimpleDateFormat dateFormat= new SimpleDateFormat("dd-MM-yyyy");  //class
		try {
			date=dateFormat.parse(dateInput);  //invoke parseMethod
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public boolean isAvailable() throws SQLException {
		
		bookingDAO bookingdao=new bookingDAO();

		busDAO busdao=new busDAO();
		
		int capacity =busdao.getCapacity(busNo);
		
		int booked=bookingdao.getBookedcount(busNo,date);
		
		return booked<capacity?true:false;
		
	}

}
