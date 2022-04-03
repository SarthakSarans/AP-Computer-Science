import java.util.*;

public class CardPlayer extends Player {

   private ArrayList<Card> hand;
   private ArrayList<Card> takenCards;

   public CardPlayer(String name, int score, ArrayList<Card> hand) {
      super(name, score);
      this.hand = hand;
      takenCards = new ArrayList<Card>();

   }

   public ArrayList<Card> getHand() {
      return hand;
   }

   public ArrayList<Card> getTakenCards() {
      return takenCards;
   }

   public void setHand(ArrayList<Card> hand) {
      this.hand = hand;
   }

   public void setTakenCards(ArrayList<Card> takenCards) {
      this.takenCards = takenCards;
   }
   public void addTakenCards(ArrayList<Card> added)
   {
      takenCards.addAll(added);
   }
   public void addCard(Card card) {
      hand.add(card);
   }

   public Card playCard(int index) {
      return hand.remove(index);

   }

    public Card chooseCard (ArrayList<Card> round, ArrayList<Card> gameCards) {
      // removes the 2 Club if you have it in hand
      Card startingCard = new Card("2", "clubs", 2);
      // if you start game
      if (gameCards.isEmpty() && hand.contains(startingCard)) {
      
         return playCard(hand.indexOf(startingCard));
      
      }
      // if ur the first palyer in round
      else if (round.isEmpty() && !gameCards.isEmpty()) {
         int randint = (int) (Math.random() * (hand.size()));
         return playCard(randint);
      
      }
      
      else {
      //adds matching cards to matchingCards
         ArrayList<Card> matchingCards = new ArrayList<Card>();
         for (int i = 0; i < hand.size(); i++) {
            if (hand.get(i).getSuit() .equals (round.get(0).getSuit())) {
               matchingCards.add(hand.get(i));
            }
         }
         // if you have a matching card
         if (!matchingCards.isEmpty()) {
            int randint = (int) (Math.random() * (matchingCards.size()));
            return playCard(hand.indexOf(matchingCards.get(randint)));
               
            
         } 
         // adds the hearts to matchingCards
         for (int b = 0; b < hand.size(); b++) {
            if (hand.get(b).getSuit().equals("hearts")) {
               matchingCards.add(hand.get(b));
            }
                  
         }
         
         
         //if you no match but heart
         if (!round.get(0).getSuit().equals("hearts") && !matchingCards.isEmpty()) {
         
            int randint = (int) (Math.random() * (matchingCards.size()));
            return playCard(hand.indexOf(matchingCards.get(randint)));
          
          // not match + no heart
         } else {
            int randint = (int) (Math.random() * (hand.size()));
            return playCard(randint);
         }
      
      }
   }


   public String toString() {

      Collections.sort(hand);

      return (super.getName() + " (" + super.getScore() + ") " + hand.toString());

   }

}