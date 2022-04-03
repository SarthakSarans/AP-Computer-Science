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

   public Card (String balls, String balls2, int balls3) {
   
      name = balls;
      suit = balls2;
      rank = balls3;
      
   }
   
   
   public String getName()
   {
   
      return name;
   }
   
   
   public void setName(String balls)
   {
      name = balls;
   }
   
   public String getSuit()
   {
      return suit;
   
   }
 
   public void setSuit(String balls)
   {
      suit = balls;
   }
   
   
   public int getRank()
   {
      return rank;
   }
 
   public void setRank(int balls)
   {
      rank = balls;
   }
   
   
   public boolean equals (Object obj)
   {
      Card balls = (Card) obj;
      if (balls.getName().equals(name) && balls.getSuit().equals(suit) && balls.getRank() == rank)
         return true;
      else
         return false;
   
   }

   public int compareTo(Object obj)
   {
      Card balls = (Card) obj;
      if (getSuit() == "clubs" && balls.getSuit() != "clubs")
         return 1;
      
      else if (balls.getSuit() == "clubs" && getSuit() != "clubs")
         return -1;
      
      else if (getSuit() == "spades" && balls.getSuit() != "spades")
         return 1;
      
      else if (getSuit() != "spades" && balls.getSuit() == "spades")
         return -1;
      
      
      else if (getSuit() == "hearts" && balls.getSuit() != "hearts")
         return 1;
      else if (getSuit() != "hearts" && balls.getSuit() == "hearts")
         return -1;
      
      else if (getSuit() == "diamonds" && balls.getSuit() != "diamonds")
         return -1;
      
      else if (getSuit() != "diamonds" && balls.getSuit() == "diamonds")
         return 1;
      
      else{
         if (getRank() < balls.getRank())
            return -1;
         else if( getRank() > balls.getRank())
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