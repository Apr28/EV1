package Question1;
public class StringvsStringBuilder {

	// 3. Write some of the String methods : Program
	
	public static void main(String[] args) {
		
		String s1 = "Hello World";
		
		//1. .length() method : it measures the length of the string 
		System.out.println(s1.length()); 
		
		
		//2. .toUpperCase() : it converts the lower case string to upper case
		String s2 = "hello";
		System.out.println(s2.toUpperCase());
		
		
		//3. .toLowerCase() : it converts the upper case string to lower case
		String s3 = "HELLO";
		System.out.println(s3.toLowerCase());
		
		
		//4. .trim() : it trims the extra spaces at the starting and ending of the string 
		String s4 = "  Amit Prakash  ";
		System.out.println(s4.trim());
		
		
		//5. .chartAt() : it takes index as input and returns the character present at that index in the entire String
		String s5 = "India";
		System.out.println(s5.charAt(3));
		
}
	
}

/*
 1. WHY IS STRING IMMUTABLE ?
  => In java Strings are immutable and there could be several possible reasons- 
  	1. It save some spaces
  	2. It increases the security. 
  	
 2. String vs StringBuilder ?
 	a. String : 
 		* Strings are immutable in nature
 		* They do not create state of ambiguity/conflict in the multi-threaded environment
 	b.StringBuilder : 
 		* Strings are not immutable in nature.
 		* In the multi-threaded environment they create a state of ambiguity or conflict as many people would be working on the same String then it'd be ambigous state for the javaC. 
 
 
 3. Write some of the String methods : Program


 * */
