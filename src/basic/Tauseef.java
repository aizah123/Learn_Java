package basic;

public class Tauseef {
	
	
	
	
	
	int length=22;
	String name; // declare variable
	String address="Queens,NY";
	String phoneNumber="89734982379";
	
	
	static String stId="2022NY";
	
	
	public static void main(String[] args) {
		
		
		LearnAccessModifier leam=new LearnAccessModifier();
		System.out.println(leam.name);
		System.out.println(leam.address);
		
		//System.out.println(leam.bankAccountNumber);
		
		System.out.println(LearnAccessModifier.price);
		System.out.println("********* Default");
		System.out.println(leam.address);
		
		
		leam.display();
	}
	
	
	

}
