package Question3;
public class Main {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.setModel("Honda city");
		c1.setcompanyName("Honda");
		c1.setColor("Red");
		c1.setEngine(new Engine());
		
		String model = c1.getModel();
		String companyname = c1.getcompanyName();
		String color = c1.getColor();
		Engine e = c1.getEngine();
		e.enableTurbo(false);
		e.setPower(3000);
		e.setRmp(3000);
		e.setManufacturer("honda corp");
		e.getHasTurbo();
		e.getPower();
		e.getManufacturer();
		e.getRmp();
		
		System.out.println("Car Model : " + c1.getModel() + "\nCar companyName : " + c1.getcompanyName() + "\nCar Color : " + c1.getColor() + "\nCar Engine : " + e.getRmp() + "\nCar Power : "+e.getPower() + "\nCar Engine Manufacturer : "+e.getManufacturer() + "\nCar Has Turbo : "+	e.getHasTurbo());
		
		
		
		
		System.out.println("\n");
		
		Car c2 = new Car("Harrier", "Tata", "black", new Engine(), 10000, "tata", 2313);
	
	}
	
}
