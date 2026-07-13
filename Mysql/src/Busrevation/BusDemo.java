package Busrevation;
import java.util.Scanner;
import java.sql.SQLException;
import java.util.ArrayList;
public class BusDemo {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		try {
		busDAO busdao=new busDAO();
		
			busdao.diplayBusInfo();
		
		
		
		int useropt=1;
		Scanner sc=new Scanner(System.in);
	
		while(useropt==1) {
			System.out.println("Enter 1 to Book and 2 to exit");
			useropt=sc.nextInt();
			if(useropt==1) {
				Booking booking=new Booking();
				if(booking.isAvailable()) {
					bookingDAO bookingdao=new bookingDAO();
					bookingdao.addBooking(booking);
					System.out.println("Your Booking is Confirmed.");
				}
				else {
					System.out.println("Sorry.Bus is full.Try another bus or date.");
				}
				
			}
		}
		

	}
		catch(Exception e) {
			System.out.println(e);
		}

}
}
