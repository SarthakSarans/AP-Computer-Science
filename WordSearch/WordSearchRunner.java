import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class WordSearchRunner
{
   public static void main(String[] args) throws FileNotFoundException
   {
      try{
      // instantiate Scanner object to read in from file
         Scanner sc = new Scanner(new File("doc.txt"));
      // read in rows
         int row = 0;
         if (sc.hasNextInt())
         {
            row = sc.nextInt();
            
         }
      // read in columns
         int col = 0; 
         if (sc.hasNextInt())
         {
            col = sc.nextInt();
         
         }
      
      // instantiate WordSearch object passing in number of rows & columns for 2D array
         WordSearch90 test1 = new WordSearch90(row, col);
      // loop through the rows in the file
         for (int i =0; i< row; i++)
         {
         // loop through the columns in the file
            for (int j = 0; j < col; j++)
            {
            // read in value from file using local variable
               String a = sc.next();
            // pass row, column, and value into the 2D array
               test1.setSpot(a.charAt(0), i,j);
            }
         }
         System.out.println(test1.toString());
      // read number of words to search for from file
         int words = sc.nextInt();
      // loops through the words
         for (int w = 0; w <= words; w++)
         {
         // read in word from file
            String word = sc.next();
           
         // method call to search for the word in the 2D array
            boolean in = test1.inGrid(word);
         // print out word to search for and true/false
            System.out.println(word + " " + in);
         }
      }
      catch(Exception io) {
      }
   }
}