package Question3;

public class OLA {
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		if(numberOfPassenger <= 3) {
			 HatchBack hb = new HatchBack();
			 hb.setNumberOfKms(numberOfKMs);
			 return hb;
		}
		else {
			Sedan s = new Sedan();
			 s.setNumberOfKms(numberOfKMs);
			return s;
		}
	}
	
	
	
	public int calculateBill(Car car) {
		int totalFare = 0; 
		if(car instanceof HatchBack) {
			
			HatchBack hb = (HatchBack) car;
			
			totalFare = car.numberOfKms  * hb.farePerKm;
			
		}
		
		else if(car instanceof Sedan) {
			Sedan s = (Sedan) car;
			totalFare = car.numberOfKms  * s.farePerKm;

		}
		
		return totalFare;
		
	}
	
}


