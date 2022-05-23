package Question2;
import java.util.Scanner;
public class Course {
	
	int courseId; 
	String courseName; 
	int courseFee;

	void displayCourseDetails() {
		System.out.println("Course ID : " + this.courseId);
		System.out.println("Course Name : " + this.courseName);
		System.out.println("Course Fee : " + this.courseFee);
	}
	
	static void authenticate(String username, String password) {
		if(username.equals("Admin") && password.equals("1234")) {
			Course c = new Course();
			Scanner sc =  new Scanner(System.in);
			System.out.println("Enter course id : "); 
			c.courseId = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Enter course name : "); 
			c.courseName = sc.nextLine();
			
			System.out.println("Enter course fee : "); 
			c.courseFee = sc.nextInt();
			
			c.displayCourseDetails();
		}
		else {
			System.out.println("Invalid Username or password");
	
	}
	
	}
	
	public static void main(String[] args) {
		
		authenticate("Admin", "1234");
		System.out.println("\n");
		authenticate("admin", "9329"); 
	}
}




















