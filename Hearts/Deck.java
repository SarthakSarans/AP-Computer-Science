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
   
   public void setDeck(ArrayList<Card> cards)
   {
   
      deck = cards;
   
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
   
   public Card getCard(int num)
   {
      return deck.get(num);
   
   }


   public Card dealTopCard()
   {
      return deck.remove(0);
   }



   public void shuffle2()
   {
      int num = (int) (Math.random()*(10-2)) + 2;
      ArrayList<Card> cards = new ArrayList<Card>();
      
      for(int i=0; i < num; i++)
      {
         cards.add(deck.get(0));
         deck.remove(0);
      
      }
      
      int num2 = (int) (Math.random() * (  (52 - num)) +1) ;
      deck.addAll(num2, cards);
      
      
      
   }

   public void shuffle()
   {
   
   Collections.shuffle(deck); 
   
   }

   public String toString()
   {
      if (!deck.isEmpty())
      {
         String str = deck.toString();
         String str2 = str.replaceAll("\\[|\\]|\"","");
         str2 = str2.replaceAll(", ","");
         return str2;
      }
      else
      {
         return "No cards in the deck!";
      }
   }




















}