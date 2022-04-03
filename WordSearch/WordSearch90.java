import java.util.Arrays;

public class WordSearch90
{
	/** one 2D array instance variable named wordArray - You CANNOT add any additional instance variables */
	
   private char[][] wordArray;
	/** constructor used to set the number of rows and columns in the 2D array
		* @param row
		* @param col*/
   public WordSearch90(int row, int col)
   {
      wordArray = new char [row] [col];
   }
	
	/** method to set an element in the 2D array
		* @param s which is the value to store in the 2D array
		* @param row the row to use
		* @param col the column to use*/
   public void setSpot(char s, int row, int col)
   {
      wordArray [row][col] = s;
   }
	
	/** methods to check for the word in the 2D array
		* @param the word to search for
		* @return return true or false*/
   public boolean inGrid(String s)
   {
      String a = "";
      String b = "";
      {
         for(int i =0; i<wordArray.length; i++)
         {
         
            for (int j = 0; j < wordArray[i].length; j++)
            {
            
               
                  a += wordArray[i][j];
               
            }
            if (a.indexOf(s) > -1)
            {
               return true;
               }
         
            b = "";
            for (int k = wordArray[i].length -1; k > -1; k--)
            {
             
                  b += wordArray[i][k];
               
            
            
            }
            if (b.indexOf(s) > -1)
            {
               return true;
            }
            a = "";
            b = "";
         }
         int col = 0;
         a = "";
         b= "";
         while (col < wordArray[0].length)
         {
            for (int row = 0; row < wordArray.length; row++)
            {
            
               a += wordArray[row][col];
               if (a.indexOf(s) > -1)
                  return true;
            
            }
            
            for (int row = wordArray.length-1; row > -1; row--)
            {
            
               a += wordArray[row][col];
               if (a.indexOf(s) > -1)
                  return true;
            
            }
            col++;
         }
         
         
         
         return false;
      }
   }
	/** toString method
		* @return String containing all elements in the 2D array*/
   public String toString()
   {
      String str = "[";
     
      for (int i =0; i< wordArray.length; i++)
      {
         str += "[ " ;
         for (int j = 0; j < wordArray[i].length; j++)
         {
                         
            str += wordArray[i][j] + " ";
         }
         if (i == wordArray.length - 1)
         {
            str += "]]" ;
         }
         else
            str+= "] \n ";
      }
      
      
      return str;
   }
}