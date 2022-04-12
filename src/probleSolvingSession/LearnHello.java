package probleSolvingSession;

import basic.LearnAccessModifier;

import basic.LearnVariable;

public class LearnHello {
	

	
	public static void main(String[] args) {
		// main method is called driver method or executable method
		
		
		// display();
		System.out.println("hello Saiful"); 
		
		
		// calling a method inside main method
		display();
		
		tvDisplay();
		
		
		LearnVariable learn = new LearnVariable();
		
		//System.out.println(learn.instructorName);
		System.out.println(learn.address);
		
		// object 
		LearnAccessModifier lm=new LearnAccessModifier();
		System.out.println(lm.name);
		//System.out.println(lm.address);
		
		//System.out.println(lm.bankAccountNumber);
		
		//System.out.println(LearnAccessModifier.price);
		
		System.out.println("********* Default");
		//System.out.println(lm.address);
		
		//lm.display();
	}
	
	
	
	
	
	public static void display() {         
		
		System.out.println("Hello Irin");   
	}
	
	
	
	public static void tvDisplay() {
		System.out.println("This is TV Display");
	}
	
	
	

	
	
	
	
	
}
