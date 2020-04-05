/**
Person.java demonstrates
	-- how to declare an instantiable class
	-- how to declare multiple constructors
		 --- constructor: during a program's execution, a constructor is used to initialize the object's instance variables when that object is created
	-- how to implement a class's attributes by declaring instance variables
	-- how to implement a class's behaviour by implementing a method (i.e. displayMe())
*/
//instantiable class
public class person {
	
	//declare instance variable
	private String name;
	private int age;
	private boolean enjoysReading;
	//default
	public person() { //constructor with no parameters
	} 
	//1
	
	public person(String name) { //constructor with 1 parameter
		this.name = name;
	}//2
	
	public person(boolean enjoysReading, String name, int age) { //3
		this.name = name;
		this.age = age;
		this.enjoysReading = enjoysReading;
	}
	
	public void displayMe() {
		System.out.println("Person's name: " + name);
		System.out.println("Person's age: " + age);
		System.out.println("Person enjoys to read: " + enjoysReading);
		System.out.println("==========");
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isEnjoysReading() {
		return enjoysReading;
	}

	
	
	
}//end class

