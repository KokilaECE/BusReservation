package Busrevation;

public class Bus {
	private int busNo;
	private boolean AC;
	private int capacity;//get and set 
	Bus(int no,boolean ac,int cap){
		this.busNo=no;
		this.AC=ac;
		this.capacity=cap;
	}
	public int getCapacity(){  //Accesor method
		return capacity;
		
	}
	public boolean isAC() {
		return AC;
	}
	public int getBusNo() {
		return busNo;
		
	}
	public void setCapacity(int cap) {// mutator
		capacity=cap;
	}
	public void setAc(boolean ac) {
		AC=ac;
	}
	public void DisplayBusInfo() {
		System.out.println("Bus no: "+ busNo +" AC: " + AC +" Total Capacity: "+ capacity);
	}


}
