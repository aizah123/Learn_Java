package basic;

public class LearnDataType {
	
	
	// Data Type
	
	
	// 
	
	
	
	// Primitive Data type
	
	// byte
	// short
	// long
	// int
	// float
	// double
	// char
	// boolean
	
	
	
	byte number=-128; // 8bits
	
	char pizzaSize='L'; // 16bits
	
	short salary=32000; // 16bits
	
	int totalSale=2000000000; // 32bits
	long annualSale=3333435345345343l;
	
	float pizzaPrice=25333333337777777777777777777777733333.522222222222222222222222222222222222220f;
	
	
	double totalOrderNumber=3333333333333333333333333333333333333333333333333333333333333333333333333333333.88888888888888888888;
	
	
	boolean pizzaIsAvailable=false; // 1bits
	
	
	
	
	// Non-Primitive Data type: String, array, defineClass
	
	String name="Ahmed";
	// Array
	
	
	
	public static void main(String[] args) {
		
		int num=33;
		String firstName="Tajwar";
		
		String lastName="Hamid";
		
		
		System.out.println(num); // calling a variable
		
		System.out.println("tajwar"); 
		System.out.println(firstName); // calling a variable
		System.out.println(lastName); // calling a variable
		
		
		int number1=40;
		int number2=60;
		int totalNumber=number1+number2;
		System.out.println(totalNumber); // calling a variable
		
		
		System.out.println("***********************************************************");
		System.out.print("Accounts Details of ");
		System.out.print(firstName+" "); // calling a variable
		System.out.println(lastName); // calling a variable
		System.out.print("Salary : ");
		double salary=12000.500;
		System.out.println(salary);
		double annualGrossSalary=salary*12;
		
		
		double annualNetSalary=annualGrossSalary  -    (annualGrossSalary   *   .3);
		//System.out.println(salary  *   12);
		System.out.print("Annual Gross Salary : ");
		System.out.println(annualGrossSalary);
		System.out.print("Annual Net Salary : ");
		System.out.println(annualNetSalary);
		
		
		System.out.println("***********************************************************");
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
