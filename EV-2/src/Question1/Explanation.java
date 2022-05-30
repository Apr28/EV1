package Question1;
public class Explanation {

	public static void main(String[] args) {
		
		Animal a = new Cheetah(); //Object of child referenced by parent class Animal 
		a.run();
		
	}
	 
}


class Animal{
	String type = "Carnivorous";
	void run() {
		System.out.println("Animal is running");
	}
}

class Cheetah extends Animal{
	@Override 
	void run() {
		System.out.println("Cheetah is running");
	}
}

// IS-A Relationship
/*
 	- IS-A relationship is also called as Parent-child relationship. 
 	- When a class inherits the properties of another class using 'extends' keyword then Inheritance is establish b.e them and Is-A relationship is created. 
 	
 	- Now the properties and methods of Parent class 'Animal' is accessible inside the child class 'Cheetah'. 
 	- The methods can be overriden inside the child further. 
 	
 	- we can create a object of child class and assign it to the reference of parent class. 
 	- parent = Super class 
 		child = Derived class or subclass

 */