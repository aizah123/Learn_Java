package basic;

public class LearnConcatenation {

	
	// Con cat e nation : + combine a variable with a String
	
	
	public static void main(String[] args) {
		
		
		int age=24;
		String firstName="Tajwar";
		String lastName="Hamid";
		
		//System.out.println(name);
		System.out.println(   "Student First Name is : "     +   firstName);
		
		System.out.println(   "Student Full Name is : "     +   firstName + " "  +  lastName);
		
		
		// first name and age 
		// output
		// First Name Tajwar and age is 24
		
		System.out.println("First Name " + firstName + " and age is " + age);

		
		//System.out.println(salary);
		System.out.println(LearnVariable.salary);
		
		
		LearnVariable learn = new LearnVariable();
		
		System.out.println(learn.instructorName);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
