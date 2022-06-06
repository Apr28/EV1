package Question2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Loan L = Loan.getLoanObj();
		
		System.out.println("Permanent Employee (PE) details -------" );
		System.out.println("Enter PE name : ");
		String peName = sc.next();
		System.out.println("Enter PE ID : ");
		int peID = sc.nextInt();
		System.out.println("Enter PE basicPay : ");
		double peBasicPay = sc.nextDouble();
		
		double loanOutput1 = L.calculateLoanAmount(new PermanentEmployee(peID, peName, peBasicPay));
		System.out.println("PE Loan amount : " + loanOutput1);
		
		System.out.println("------------------------------------");
		
		
		System.out.println("Temporary Employee (TE) details -------" );
		System.out.println("Enter TE name : ");
		String teName = sc.next();
		System.out.println("Enter TE ID : ");
		int teID = sc.nextInt();
		System.out.println("Enter TE hours worked : ");
		int teHoursWorked = sc.nextInt();
		System.out.println("Enter TE hourly wages : ");
		int teHourlyWages = sc.nextInt();
		
		double loanOutput2 = L.calculateLoanAmount(new TemporaryEmployee(teID, teName, teHoursWorked, teHourlyWages));
		System.out.println("TE Loan amount : " + loanOutput2);
		
		System.out.println("------------------------------------");
		
		L.calculateLoanAmount(null);
	}
}









