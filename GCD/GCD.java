public class GCD
{
	//instance variables - DO NOT ADD ANY MORE INSTANCE VARIABLES
   private int numerator;
   private int denominator;
	
	//default constructor
   public GCD()
   {
      numerator = 0;
      denominator = 0;
   }
	
	//initialization constructor
   public GCD (int x, int y)
   {
   
      numerator = x;
      denominator = y;
   
   }
	
	//modifier method for numerator
   public void setNumerator(int x)
   {
      numerator = x;
   }
	
	//modifier method for denominator
   public void setDenominator(int y)
   {
      denominator = y;
   }
	
	//accessor method for numerator
   public int getNumerator()
   {
      return numerator;
   }
	
	//accessor method for denominator
   public int getDenominator()
   {
      return denominator;
   }
	//method to determine gcd called calcGCD
   public int calcGCD()
   {
      int i = 1;
      int gcd = 0;
      int f = numerator;
      int s = denominator;
      while (i != 0)
      {
         i = f - s * (f/s);
         f = s;
         s = i;
      
      }
      gcd = f;
      return gcd;
   }
	
	//method to determine lowest term of numerator called numeratorSimplified
   public int numeratorSimplified()
   {
      return  numerator/calcGCD();
   }
	
	//method to determine lowest term of denominator called denominatorSimplified
   public int denominatorSimplified()
   {
   
      return denominator/calcGCD();
   
   
   }
	
	// toString() method that only returns the GCD
   public String toString()
   {
   
      return "" + calcGCD();
   }
}