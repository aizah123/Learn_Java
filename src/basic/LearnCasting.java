package basic;

public class LearnCasting {
	
	
	// Casting : converting data type
	
	
	static int number =24;
	
	static double salary =3450.68;
	
	
	// float to double
	float rent= 2500.500f;
	double aprilRent= (double) rent;
	
	float mayRent=(float)aprilRent;
	
	
	
	
	
	public static void main(String[] args) {
		
		// double type of data except int type of data also
		// 50     50.0
		
		double num  =  LearnCasting.number;
		
//		int newSalary    = ( int   )   LearnCasting.salary;
//		
//		
//		//int price=45.5;
//		
//		System.out.println(LearnCasting.number);
//		System.out.println(newSalary);
		System.out.println(num);
		
		
		
		int num1= 45;
		double num2=num1;
		
		int num3= (int)num2;
		
		
		LearnCasting lc=new LearnCasting();
		System.out.println(lc.mayRent);
		
		
		byte a=123;
		short b=a;
		byte c=(byte) b;
		
		short d=3000;
		byte e= (byte) d;
		System.out.println(e);
		
		// 1024 bits =1 byte
		
		// we will come back at 7.46pm EST
		
		
		
		
		
	}
	
	
	
	
	
	

}
