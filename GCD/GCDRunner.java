import java.util.*;

public class GCDRunner
{
	//main method
	public static void main(String[] args)
	{
		//instantiate Scanner object
		Scanner sc = new Scanner(System.in);
		
		//prompt user for numerator
		System.out.println("Enter the numerator:");
		
		//assign user input to variable
		int num = sc.nextInt();

		
		//prompt user for denominator
		System.out.println("Enter the denominator:");
  
		
		//assign user input to variable
		int den = sc.nextInt();

		
		//instantiate GCD object
		GCD obj = new GCD(num, den);
		//call toString() method
		System.out.println("The GCD is: " + obj.toString());
		//print fraction in lowest term

		System.out.println("The fraction in lowest terms is " + obj.numeratorSimplified() + "/" + obj.denominatorSimplified());
	}
}