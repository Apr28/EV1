package Question4;
import java.util.Scanner;
public class Main {

	public static Person generatePerson(Person person) {
		
		if(person instanceof Student) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter name : ");
			String nm = sc.next();
			person.setName(nm);
			
			System.out.println("Student Gender : ");
			String gen = sc.next();
			person.setGender(gen);
			
			
			Student s = (Student) person;
			
			System.out.println("StudentId : ");
			int id = sc.nextInt();
			s.setStudentId(id);
						
			System.out.println("Student course : ");
			String course = sc.next();
			s.setCourseEnrolled(course);
			
			System.out.println("Student course fee : ");
			int fee = sc.nextInt();
			s.setCourseFee(fee);
			
			System.out.println("Student state"); 
			String st = sc.next();
			person.ads.setState(st);
			
			System.out.println("Student pincode"); 
			String pin = sc.next();
			person.ads.setPinCode(pin);
			
			System.out.println("Student City"); 
			String ct = sc.next();
			person.ads.setCity(ct);

		
		}
		else if(person instanceof Instructor) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter name : ");
			String nm = sc.next();
			person.setName(nm);
			
			System.out.println("Student Gender : ");
			String gen = sc.next();
			person.setGender(gen);
			
			
			Instructor s = (Instructor) person;
			
			System.out.println("InstructorID : ");
			int id = sc.nextInt();
			s.setInstructorId(id);
						
			System.out.println("Instructor salary : ");
			int salary = sc.nextInt();
			s.setSalary(salary);

			
			System.out.println("Instructor state"); 
			String st = sc.next();
			person.ads.setState(st);
			
			System.out.println("Instructor pincode"); 
			String pin = sc.next();
			person.ads.setPinCode(pin);
			
			System.out.println("Instructor City"); 
			String ct = sc.next();
			person.ads.setCity(ct);

		}
		
		return person;
		
	}
	
	public static void main(String[] args) {
		
		Person p1 = generatePerson(new Student());
		System.out.println(p1);
		
		Person p2 = generatePerson(new Instructor());
		System.out.println(p2);
	}
}
