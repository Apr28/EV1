package Question4;
public class Person {
	
	String name ;
	String gender;
	
	Address ads = new Address();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
}


class Instructor extends Person {

	int instructorId;
	int salary;
	
	
	
	
	public int getInstructorId() {
		return instructorId;
	}




	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}




	public int getSalary() {
		return salary;
	}




	public void setSalary(int salary) {
		this.salary = salary;
	}




	@Override
	public String toString() {
		

		return "Instructor[[InstructorId" + this.getInstructorId() + "Salary" + this.getSalary()  + "Addresses Address[" + "City" + this.ads.getCity() + "State" + this.ads.getState() + "Pincode" + this.ads.getPinCode()+ "]" + "]";
	}
	
}

class Student extends Person {
	
	int studentId;
	String courseEnrolled;
	int courseFee;
	
	
	
	
	public int getStudentId() {
		return studentId;
	}




	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}




	public String getCourseEnrolled() {
		return courseEnrolled;
	}




	public void setCourseEnrolled(String courseEnrolled) {
		this.courseEnrolled = courseEnrolled;
	}




	public int getCourseFee() {
		return courseFee;
	}




	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}




	@Override
	public String toString() {
		
		return "Student[[studentId" + this.getStudentId() + "CourseFee" + this.getCourseFee() + "courseEnrolled" + this.getCourseEnrolled() + "Addresses Address[" + "City" + this.ads.getCity() + "State" + this.ads.getState() + "Pincode" + this.ads.getPinCode()+ "]" + "]";
	}
}





