import java.util.Scanner;


public class carinsureance {
	

//Declare and Create Scanner object
Scanner input = new Scanner(System.in){
	
	public static void main(String[] args){
		
	// declare all variables
		int gender;
		double age, yearsfree ,estimate;
		 int female,male;
			double rate,baserate = 200,baserate2 = 1500, baserate3 = 800;
	
		
		
	// ask user for age
	System.out.println("Enter age please: ");
	age = input.nextint();
	if( age <20 || age > 75);{
	System.out.println("you are to old or to young to insure");
	
	// ask user for gender
	}System.out.println("enter in your gender plesae male/female");
	gender = input.nextint();{
	if (gender = female)
	{
	System.out.println("you can be insured on two types of base rate");
	
	}else (female < 25 )= baserate2 || (female >25) != baserate3;{
	
	System.out.println("the base rate for you is" + baserate2 ("or") + baserate3);{
	}if  (gender = male);
	male = baserate;}
	System.out.println("your base for being is" + baseraste);
	// ask user for how many years accident free
	System.out.println("enter number of years accident free"); 
	yearsfree = input.nextint();{
	if (yearsfree = estimate);{
	estimate = (yearsfree*0.10);
	System.out.println("this the reduction for accident free driving" + yearsfree);
	System.exit(0); // Terminate program
	   } // end method
	} // end class
	
	
	

	

			 

