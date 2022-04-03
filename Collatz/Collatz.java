public class Collatz
{
   private int startNum;

   public Collatz()
   {
      startNum=0;
   }
   public Collatz(int x)
   {
      startNum=x;
   
   }

   public int steps()
   {
      int count = 0;
      int step1 = startNum;
      for (int i =0; step1 != 1; i++)
      {
         if ((step1 % 2) == 1)
         {
            step1 = step1*3 + 1;
            count++;
         }
         else {
         
            step1 = step1 /2;
            count++;
         }
      
      }
   
      return count+1;
   
   }


   public int[] sequence()
   {
      int [] ar = new int[steps() ];
      ar[0] = startNum ;
   
   
      for (int i = 1; i < steps() ; i++)
      {
         if ((ar[i-1] % 2) == 1)
         {
            if (i==0)
            {
               ar[1] = ar[0]*3 + 1;
               i++;
            }
            else
            {
               ar[i] = ar[i-1]*3 + 1;
            
            }
         }
         else if (i >=1 && ((ar[i] % 2) == 0)) 
         {
            ar[i] = ar[i-1]/2;
         
         }
      
      }
      return ar;
   
   }

   public int maxValue()
   {
      int ar[] = sequence();
      int max = ar[0];
      for (int i = 0; i < steps(); i++)
      {
         if (ar[i] > max)
         {
            max = ar[i];
         }
         else 
            max = max;
      
      }
      
      return max;
   }
   public int minOddValue()
   {
      int ar[] = sequence();
      int min = ar[0];
      for (int i=0; i < steps()-1; i++)
      {
      
         if ((ar[i] < min) && (ar[i]%2 == 1))
         {
            min = ar[i];
         }
       
      
      }
      if (min % 2 == 0)
         min = 1;
      return min;
   }
   
   public int[] oddValues()
   {
   
      int[] ar = sequence();
      int count = 0;
      int a = 0;
      
      for (int i = 0; i < steps(); i ++)
      {
         if (ar[i] % 2 == 1)
            count ++;
      }
      int odd[] = new int[count];
      for (int i = 0; i < steps()-1; i++)
      {
         
      
         if (ar[i] % 2 == 1)
         {
            odd[a] = ar[i];
            a++;
         }
      
      
      }
      odd[count-1] = 1;
      return odd;
   
   } 
   public int sumValues()
   {
   int[] ar = sequence();
   
   int sum = 0;
   
   for (int i=0; i < steps(); i++)
   {
   
   sum += ar[i];
   
   } 
    return sum;
   
   }

   public String toString()
   {
   return "Starting number " + startNum + " takes " + steps() + " steps";
   
   
   }


}



