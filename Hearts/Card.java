import java.util.*;

public class Card implements Comparable<Object>{


   private String name;
   private String suit;
   private int rank;
   
   public Card () {
   
      name = "default";
      suit = "default";
      rank = 0;
   }

   public Card (String str, String str2, int num) {
   
      name = str;
      suit = st2;
      rank = num;
      
   }
   
   
   public String getName()
   {
   
      return name;
   }
   
   
   public void setName(String str)
   {
      name = str;
   }
   
   public String getSuit()
   {
      return suit;
   
   }
 
   public void setSuit(String str)
   {
      suit = str;
   }
   
   
   public int getRank()
   {
      return rank;
   }
 
   public void setRank(int num)
   {
      rank = num;
   }
   
   
   public boolean equals (Object obj)
   {
      Card cardObj = (Card) obj;
      if (cardObj.getName().equals(name) && cardObj.getSuit().equals(suit) && cardObj.getRank() == rank)
         return true;
      else
         return false;
   
   }

   public int compareTo(Object obj)
   {
      Card cardObj = (Card) obj;
      if (getSuit() == "clubs" && cardObj.getSuit() != "clubs")
         return 1;
      
      else if (cardObj.getSuit() == "clubs" && getSuit() != "clubs")
         return -1;
      
      else if (getSuit() == "spades" && cardObj.getSuit() != "spades")
         return 1;
      
      else if (getSuit() != "spades" && cardObj.getSuit() == "spades")
         return -1;
      
      
      else if (getSuit() == "hearts" && cardObj.getSuit() != "hearts")
         return 1;
      else if (getSuit() != "hearts" && cardObj.getSuit() == "hearts")
         return -1;
      
      else if (getSuit() == "diamonds" && cardObj.getSuit() != "diamonds")
         return -1;
      
      else if (getSuit() != "diamonds" && cardObj.getSuit() == "diamonds")
         return 1;
      
      else{
         if (getRank() < cardObj.getRank())
            return -1;
         else if( getRank() > cardObj.getRank())
            return 1;
         else 
            return 0;
      }
   
   
   }
   public String toString()
   {
   
      return "" + getSuit().charAt(0) + getName() + "(" + getRank() + ")" ;
   }




























}