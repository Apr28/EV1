package Question2;
public class Loan {

	private Loan() {
		
	}

	public double calculateLoanAmount(Employee employeeObj) {
		double loan = 0.0;
		if(employeeObj instanceof PermanentEmployee) {
			
			System.out.println("Permanent Employee details ------");
			System.out.println("Name : " + employeeObj.getEmployeeName());
			System.out.println("ID : " + employeeObj.getEmployeeId());
			
			PermanentEmployee pe = (PermanentEmployee) employeeObj;
			System.out.println("Basic pay : " + pe.getBasicPay());
			
			employeeObj.calculateSalary();
			System.out.println("Salary : " + employeeObj.getSalary());
			
			loan += (0.15 * employeeObj.getSalary()) ;
			
			
		}
		else if(employeeObj instanceof TemporaryEmployee) {
			//loan = 10%
			System.out.println("Temporary Employee details ------");
			System.out.println("Name : " + employeeObj.getEmployeeName());
			System.out.println("ID : " + employeeObj.getEmployeeId());
			
			TemporaryEmployee te = (TemporaryEmployee) employeeObj;
			System.out.println("Hours Worked : " + te.getHoursWorked());
			System.out.println("Hourly Wages : " + te.getHourlyWages());
			
			employeeObj.calculateSalary();
			System.out.println("Salary : " + employeeObj.getSalary());
			
			loan += (0.10 * employeeObj.getSalary()) ;

		}
		else if(employeeObj == null) {
			System.out.println("NullPointerException");
		}
		
		return loan;
	}
	
	
	public static Loan getLoanObj() {
		return new Loan();
	}
}
