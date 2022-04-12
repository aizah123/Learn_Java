package basic;

public class LearnAccessModifier {
	
	// Access Modifier: before variable and before method and before class
	
	
	// Public : No Restrictions : Have the access from any package
	// Private : Full Restrictions : Have the access from same class only
	// Protected: have the access in same package only.
	// Default: same behavior like protected
	
	
	
	public String name="Ahmed";
	String address="Jamaica,NY"; // Default Access modifier
	private String bankAccountNumber="7897349534";
	protected static int price = 45;
	
	
	
	// living room is public place
	// master bedroom is private
	
	public static void main(String[] args) {
		
		
		//private int number=34;
		
		
		// object 
		LearnAccessModifier lam=new LearnAccessModifier();
		System.out.println(lam.name);
		
		// private variable is called within same class
		System.out.println(lam.bankAccountNumber);
		
		System.out.println(LearnAccessModifier.price);
		System.out.println(lam.address);
		
		
		lam.display(); // call method by object name
		
	}
	
	
	
	 void display() {
		System.out.println("This is a Display");
	}
	
	
	

}
