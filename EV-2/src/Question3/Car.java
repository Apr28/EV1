package Question3;
public class Car {

	int numberOfPassenger;
	int numberOfKms;
	
	
	public void setNumberOfKms(int numberOfKms) {
		this.numberOfKms = numberOfKms;
	}
	
	
	
}


class Sedan extends Car {
	public final int farePerKm = 20;
}


class HatchBack extends Car {
	public final int farePerKm =15;
}








