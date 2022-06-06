package Question2;
public abstract class Employee {

	protected int employeeId;
	protected String employeeName;
	protected double salary;
		
	Employee(int employeeId, String employeeName){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public abstract void calculateSalary();
	
}


class PermanentEmployee extends Employee {
	
	private double basicPay;
	
	PermanentEmployee(int employeeId, String employeeName, double basicPay){
		//Take input from the user
		super(employeeId, employeeName);
		this.basicPay = basicPay;
	}
	
	@Override
	public void calculateSalary() {
		double PFamount = this.basicPay * 0.12;
		this.salary =  this.basicPay - PFamount;
		this.setSalary(salary);
	}

	public double getBasicPay() {
		return basicPay;
	}

	
	
}


class TemporaryEmployee extends Employee {
	private int hoursWorked;
	private int hourlyWages;
	
	
	public int getHoursWorked() {
		return hoursWorked;
	}

	public int getHourlyWages() {
		return hourlyWages;
	}


	 
	 TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) {
		 super(employeeId, employeeName);
		 this.hoursWorked = hoursWorked;
		 this.hourlyWages = hourlyWages;
	 }
	 
	 @Override
		public void calculateSalary() {
			this.salary =  this.hoursWorked * this.hourlyWages;
			this.setSalary(salary);
		}
	 
	 
	 
}


















