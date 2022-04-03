public class Vigenere
{
   // declare instance variables for text and keyword
   private String plainText;
   private String key;

   // default constructor
   public Vigenere ()
   {
      
   }
    
   // initialization constructor
   public Vigenere (String theMsg, String theKey)
   {
      plainText = theMsg;
      key = theKey;
   }
    
   // modifier method for plainText
   public void setPlainText (String text)
   {
      plainText = text;
   }
    
   // modifier method for key
   public void setKey (String key)
   {
      this.key = key;
   }

    
   // accessor method for plainText
   public String getPlainText()
   {
      return plainText;
   }
    
   // accessor method for key
   public String getKey()
   {
      return key;
   
   
   }
    
   // encrypt method
   //   return a String
   //   no parameters
   public String encrypt()
   {
      String message = "";
      int kl = key.length();
      String pt = plainText;
      char[] arrOfChars = new char[pt.length()];
       
      for (int i = 0; i < pt.length(); i++)
      {
       
         arrOfChars[i] = plainText.charAt(i);
      }
       
   
       
      for (int i = 0; i < pt.length(); i++)
      {
       
         message += (char) (((int) arrOfChars[i] - 65 + (int) key.charAt(i % kl) -65 ) %26   + 65 );
       
      }
       
       
   
      return message;
   }
   
    
   // decrypt method
   //   return a String
   //   String parameter 
   public String decrypt(String msg)
   {
   
      String message = "";
      int kl = key.length();
      String pt = msg;
      char[] arrOfChars = new char[pt.length()];
       
      for (int i = 0; i < pt.length(); i++)
      {
       
         arrOfChars[i] = msg.charAt(i);
      }
       
   
       
      for (int i = 0; i < pt.length(); i++)
      {
       if ((int) key.charAt(i % kl) > (int) arrOfChars[i])
       {
       int man = (int) key.charAt(i % kl) - (int) arrOfChars[i];
       message += (char)(91 - man);
       }
       
       else{
         message += (char) ((Math.abs((int) arrOfChars[i] - (int) key.charAt(i % kl)) + 65 )   );
       }
      }
       
       
   
      return message;
   
   
   
   
   }
   
   // equals method
   //   return a boolean
   //   Vigenere reference parameter
   public boolean equals(Object obj)
   {
      Vigenere s = (Vigenere) obj;
      if ((plainText.equals(s.getPlainText()) && (key.equals(s.getKey()))))
         return true;
      else 
         return false;
   }
 
   
   // toString() method
   public String toString()
   {
      return("plain Text     = " + plainText + "\nkey            = " + key + "\nencrypted Text = " + encrypt());    // Do NOT modify 
   }
    
}