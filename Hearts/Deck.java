import java.util.*;

public class Deck{

   private ArrayList<Card> deck;

   public static final String[] NAMES = {"2","3","4","5","6","7","8","9","T","J","Q","K","A"};
   public static final String[] SUITS = {"clubs", "spades", "hearts", "diamonds"};
   public static final int[] RANKS = {2,3,4,5,6,7,8,9,10,11,12,13,14};


   public Deck()
   {
      
      initializeDeck();
   
   }

   public ArrayList<Card> getDeck()
   {
      return deck;
   
   }
   
   public void setDeck(ArrayList<Card> balls)
   {
   
      deck = balls;
   
   }
   public void initializeDeck()
   {
   deck = new ArrayList<Card>();
      Card c;
      for(int i = 0; i < SUITS.length; i++)
      {
         for (int b = 0; b < RANKS.length; b++)
         
         {
            c = new Card(NAMES[b],SUITS[i], RANKS[b]);
            deck.add(c);
         
         }
      }
   }
   
   public Card getCard(int balls)
   {
      return deck.get(balls);
   
   }


   public Card dealTopCard()
   {
      return deck.remove(0);
   }



   public void shuffle2()
   {
      int balls = (int) (Math.random()*(10-2)) + 2;
      ArrayList<Card> balls2 = new ArrayList<Card>();
      
      for(int i=0; i < balls; i++)
      {
         balls2.add(deck.get(0));
         deck.remove(0);
      
      }
      
      int balls3 = (int) (Math.random() * (  (52 - balls)) +1) ;
      deck.addAll(balls3, balls2);
      
      
      
   }

   public void shuffle()
   {
   
   Collections.shuffle(deck); 
   
   }

   public String toString()
   {
      if (!deck.isEmpty())
      {
         String balls = deck.toString();
         String balls2 = balls.replaceAll("\\[|\\]|\"","");
         balls2 = balls2.replaceAll(", ","");
         return balls2;
      }
      else
      {
         return "No cards in the deck!";
      }
   }




















}