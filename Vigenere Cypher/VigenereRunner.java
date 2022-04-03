import java.util.Scanner;

public class VigenereRunner
{
   public static void main(String[] args)
   {
      // instantiate a Scanner object
      Scanner scan = new Scanner(System.in);
   
      // prompt the user for the text to encrypt
      System.out.println("Enter text to encrypt:");
   
      // assign user input to a variable
      String plainText = scan.nextLine();
   
      // prompt the user for a keyword to use
      System.out.println("Enter your keyword:");
   
      // assign user input to a variable
      String key = scan.nextLine();
   
      // instantitate a Vigenere object and set its private instance
      // variables to the user input
      // *** YOUR CODE HERE ***
      Vigenere v = new Vigenere(plainText, key);
      // get the encrypted text
      // *** YOUR CODE HERE ***
      System.out.println(v.decrypt(plainText));
      // print the encrypted text
      System.out.println(v);
      
      // check the equals() method
      Vigenere v2 = new Vigenere();
      v2.setPlainText(plainText);
      v2.setKey(key);
      System.out.println("Messages & Keys same = " + v.equals(v2));
      Vigenere v3 = new Vigenere();
      v3.setPlainText(plainText);
      v3.setKey("QWERTY");
      System.out.println("Messages & Keys same = " + v.equals(v3));
      Vigenere v4 = new Vigenere();
      v4.setPlainText("QWERTY");
      v4.setKey(key);
      System.out.println("Messages & Keys same = " + v.equals(v4));
   }
}