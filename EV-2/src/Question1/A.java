package Question1;
public class A {

	B bVar = new B();
	
	public static void main(String[] args) {
		A a1 = new A();
		a1.bVar.funB();
		
	}
	
}

//Explanation of Has-A relationship. 
/*
 	- The classes A and B are having has-a relationship with each other which is also called as Object collaboration in Java. 
 	
 	- In the above class A we have created the object of class B as the Instance variable for the class A upcoming objects. 
 	
 	- We have funB() method inside the class B. 
 	
 	- And with the help of Object reference of Class A we're calling the object reference of B class which has been present inside class A as an Instance variable. And then using that syntaxt (a1.bVar) we're then accessing the 'funB()' method of B class. 
 	This relationship is called Has-A relationship or Object collaboration
 	




 */