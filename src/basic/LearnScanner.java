package basic;

import java.util.Scanner;

public class LearnScanner {
	
	// Scanner: scan the document and return as image or pdf file
	
	
	// Scanner: Taking input from user and return output in console
	
	
	// Scanner in java is class
	
	public static void main(String[] args) {
		// Create an object of Scanner class
		// Scanner class is coming from JDK
		// Argument need to pass
		Scanner input = new Scanner(System.in);
		
//		System.out.println("Enter your First Name");
//		// this line will request you to enter a string value during runtime
//		String fname=input.nextLine();
//		System.out.println("My First Name is : "+fname);
//		
//		System.out.println("Enter your Last Name");
//		String lname=input.nextLine();
//		System.out.println("My Last Name is : "+lname);
//		
//		
//		System.out.println("Enter your Age");
//		int age=input.nextInt();
//		System.out.println("My Age is : "+age);
//		
//		
//		System.out.println("Did you get job");
//		boolean checkJobStatus=input.nextBoolean();
//		System.out.println("Job Status : "+checkJobStatus);
//		
//		
//		System.out.println("What is your expected salary?");
//		double expSalary=input.nextDouble();
//		System.out.println("Expected Salary : "+expSalary);
//		
//		
//		System.out.println("What is your dress size");
//		char dressSize=input.next().charAt(0);
//		System.out.println("Dress Size : "+dressSize);
//		
		
		System.out.println("********* Calculate salary *********");
		
		System.out.println("Enter your working hours");
		int workingHours=input.nextInt();
		System.out.println("Working hours : "+workingHours);
		
		System.out.println("Enter your per hour salary rate");
		double perHourSalary=input.nextDouble();
		System.out.println("per hour salary rate : "+perHourSalary);
		
		double weeklySalary=workingHours*perHourSalary;
		System.out.println("Weekly Salary : "+weeklySalary);
		
		double monthlySalary=weeklySalary*4;
		System.out.println("Monthly Salary : "+monthlySalary);
		
		double yearlySalary=weeklySalary*52;
		System.out.println("Yearly Gross Salary : "+yearlySalary);
		
		
		System.out.println("Enter Tax bracket");
		double tax=input.nextDouble();
		System.out.println("Tax bracket : "+tax);
		
		double yearlyNetSalary=yearlySalary-yearlySalary*tax;
		System.out.println("Yearly net Salary : "+yearlyNetSalary);
		
		
		
	}
	
	
	
	

}
