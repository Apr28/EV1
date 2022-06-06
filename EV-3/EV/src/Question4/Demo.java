package Question4;
import java.util.Scanner;
import java.util.regex.*;
public class Demo {
	
	public static void validation(String usrname, String password, String email, String mobNumber) {
		
		if(Pattern.matches("[a-zA-Z0-9]{3, 8}", password) && Pattern.matches("[6789]{1}[0-9]{9}", mobNumber) && Pattern.matches("[a-z]{3,6}+[@]+[a-j]{3, 10}+[\\.]+[com]{3}", email)) {
			
						Customer c = new Customer();
			c.setEmail(email);
			c.setPassword(password);
			c.setUsername(usrname);
			c.setMobileNumber(mobNumber);
			
			System.out.println("User Details -------");
			System.out.println("EMail : " + c.getEmail());
			System.out.println("Username : " + c.getUsername());
			System.out.println("Password : " + c.getPassword());
			System.out.println("Mobile : " + c.getMobileNumber());
		}
		else {
			System.out.println("Invalid Inputs");
		}
	}

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter email : ");
		String email = sc.next();
		
		System.out.println("enter username : ");
		String username = sc.next();
		
		System.out.println("enter password : ");
		String password = sc.next();
		
		System.out.println("enter mobileNumber : ");
		String mobile = sc.next();
		
		Demo.validation(username, password, email, mobile);
	}
}
