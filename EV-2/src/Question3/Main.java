package Question3;
import java.util.Scanner;
public class Main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no. of passenger: ");
		int numPassenger = sc.nextInt();
		
		System.out.println("Enter no. of Kms");
		int numKms = sc.nextInt();
		
		OLA o = new OLA();
		Car myCar = o.bookCar(numPassenger, numKms);
		
		int res = o.calculateBill(myCar);
		System.out.println("Toral fare : " + res);

	}
}
