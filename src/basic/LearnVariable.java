package basic;

public class LearnVariable {
	
	
	
	// Variable: is a container which can hold value
	// vary able: value will change based on its need
	// What is variable?
	
	// Create a variable
	// DataType varaibleName = varaibleValue;
	
	String instructorName = "Mahmud";
	
	public String address = "Queens,NY";
	
	// String is a Data type
	// instructorName is a variable name
	// = is Assignment operator
	// "Mahmud" is a string value which is a string type of data
	
	
	// Declare a variable
	
	String name;
	
	// Declare a variable and Assign value
	String studentName    =     "Tajwar";
	
	int age=24; // global instance variable
	static int salary=5000; // global static variable
	
	
	// left side  variableName = right side value
	 // a = 5; 
	
	
	// Global variable/ global scope/ class variable
	// Any variable you created inside of a class but outside of a method is called class level variable
	
	
	
	
	// Any variable you created inside of a method is called local variable
	
	
	public static void main(String[] args) {
		
		int a=5;
		int b=6;
		
		int c   =   b;
		int d=b-c;
		int e= b*c;
		
		System.out.println(c);
		System.out.println(d);
		
		System.out.println(e);
		
		System.out.println(salary);
		
		// static global variable is called by class name
		System.out.println(LearnVariable.salary);

		// non static variable we can not call directly or using class name.
		// create object:
		// className objectName = new constructorOfClass();
		
		LearnVariable obj = new LearnVariable();
		
		
		
		
		System.out.println(obj.age);
		
		
		LearnVariable le =new LearnVariable();
		LearnVariable.salary=6666; // ReAssign value
		le.age=34;
		
		LearnVariable.salary=7777; 
		
		
		le.salary=7777; 
		salary=9999; // without class name and object name
		LearnVariable.salary=7777; 
		
		System.out.println(LearnVariable.salary);
		System.out.println(le.age);
		
		
		// mobile phone: battery,camera,ram,microphone,speaker
		
		// class {   variable, methods                             }
		// obj is a instance of class
		
		
		
		
		Tauseef ta=new Tauseef();
		ta.length=100; // ReAssign value
		
		System.out.println(ta.length);
		
		
		ta.name="Ahmed";
		ta.name="Husna";
		ta.name="Shebley";
		System.out.println("Student Name : "+ta.name);
		
		ta.address="bronx,NY";
		System.out.println("Address : "+ta.address);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
