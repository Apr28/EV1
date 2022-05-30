package Question2;
import java.util.Scanner;
public class Demo {
	
	static void createObj(int num) {
		
		int totalMarks = 0; 
	
		for(int i=0; i<num; i++) {
			Student [] stAr = new Student[num];
			stAr[i] = new Student();
			
			Scanner s = new Scanner(System.in); 
			System.out.println("Enter name : ");
			String sName = s.next();

			System.out.println("Enter Roll : ");
			int sRoll = s.nextInt();
			
			System.out.println("Enter Marks : ");
			int sMarks = s.nextInt();
			
			System.out.println("Enter Address : ");
			String sAddress = s.next();
			
			stAr[i].setName(sName);
			stAr[i].setRoll(sRoll);
			stAr[i].setAddress(sAddress);
			stAr[i].setMarks(sMarks);
			
			System.out.println(stAr[i].getName());
			System.out.println(stAr[i].getRoll());
			System.out.println(stAr[i].getAddress());
			System.out.println(stAr[i].getMarks());
			
			totalMarks += stAr[i].getMarks();
		}
		
		System.out.println("----------");
		System.out.println(totalMarks);
		System.out.println("total averge = " + totalMarks/num);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int inputNum = sc.nextInt();
		
		createObj(inputNum);

	}
}
