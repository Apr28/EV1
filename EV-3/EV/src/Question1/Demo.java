package Question1;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in Array : ");
		int input = sc.nextInt();
		
		int [] arr = new int [input];
		
		for(int i = 0; i<input; i++) {
			System.out.print("Enter the element: ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the index of the array element you want to access");
		
		try {
			int index = sc.nextInt();
			int num = arr[index]; 
			System.out.println("The array element at index " + index + " = " + num);
			System.out.println("The array element successfully accesse");
		}
		catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println(aie);
		}
		catch(NumberFormatException nfe) {
			System.out.println(nfe);
		}
		catch(InputMismatchException ime) {
			System.out.println("java.lang.NumberFormatException");
		}
	
	}
}
