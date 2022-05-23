package Question3;
public class Car {

	private String model;
	private String companyName;
	private String Color;
	private Engine engine;
	
	Car(){
		
	}
	
	public void setModel(String md) {
		this.model = md;
	};
	public String getModel() {
		return model;
	}
	
	public void setcompanyName(String cmp) {
		this.companyName = cmp;
	};
	public String getcompanyName() {
		return companyName;
	}
	
	public void setColor(String clr) {
		this.Color = clr;
	};
	public String getColor() {
		return Color;
	}
	
	public void setEngine(Engine e) {
		this.engine = e;
	};
	public Engine getEngine() {
		return engine;
	}
	
	
	
	
	
	
	
	

	
	Car(String md, String cmp, String clr, Engine e, int rpm, String mnf, int pwr){
		this.model = md;
		this.companyName = cmp;
		this.Color = clr;
		this.engine = e;
		
		this.engine.enableTurbo(true);
		this.engine.setRmp(rpm); 
		this.engine.setManufacturer(mnf);
		this.engine.setPower(pwr);

		
		System.out.println("Car Model : " + this.model + "\nCar companyName : " + this.companyName + "\nCar Color : " + this.Color + "\nCar Engine : " + this.engine.getRmp() + "\nCar Power : "+this.engine.getPower() + "\nCar Engine Manufacturer : "+this.engine.getManufacturer() + "\nCar Has Turbo : "+	this.engine.getHasTurbo());
	}
	
}


class Engine {
	
	private int rmp;
	private int Power;
	private String manufacturer;
	private boolean hasTurbo;
	
	//setter method !!
	public void enableTurbo(boolean enable) {
		this.hasTurbo = enable;
	}
	public boolean getHasTurbo() {
		return hasTurbo;
	}
	
	public void setRmp(int rmp) {
		this.rmp = rmp;
	}
	public int getRmp() {
		return rmp;
	}
	
	public void setManufacturer(String mnf) {
		this.manufacturer = mnf;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	
	public void setPower(int pr) {
		this.Power = pr;
	}
	public int getPower() {
		return Power;
	}
}














