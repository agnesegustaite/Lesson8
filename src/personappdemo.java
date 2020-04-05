import java.util.Scanner;

/** 
Develop an application which creates multiple objects of type Person class
Store them in an array, retrieve the objects 
from the array and call different methods on these objects.
*/

public class personappdemo {
	public static void main(String[] args) {
		//declare an array of type Person
		person person [];
		
		//to store the number of Person to be created
		int n; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many persons will be created?");
		
		n = sc.nextInt();
		person = new person [n];
		
		//local variables to store:
		String name;
		int age;
		boolean enjoysReading;

		//for loop to take the users input, in each iteration create an object of type Person
		//using the given input, and store it in the []
		for(int i = 0; i < n; i++) {
			
		}
		
	}
}