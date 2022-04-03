import java.util.*;

public class CardPlayerLevel1 extends CardPlayer
{

   public CardPlayerLevel1 (String name, int score, ArrayList<Card> hand) {
      super(name,score,hand);
   
   
   }






   public Card chooseCard (ArrayList<Card> round, ArrayList<Card> gameCards) {
      // removes the 2 Club if you have it in super.getHand()
      Card startingCard = new Card("2", "clubs", 2);
      // if you start game
      if (gameCards.isEmpty() && super.getHand().contains(startingCard)) {
      
         return playCard(super.getHand().indexOf(startingCard));
      
      }
      // if ur the first palyer in round
      else if (round.isEmpty() && !gameCards.isEmpty()) {
         int randint = (int) (Math.random() * (super.getHand().size()));
         return playCard(randint);
      
      }
      
      else {
      //adds matching cards to matchingCards
         ArrayList<Card> matchingCards = new ArrayList<Card>();
         for (Card checkHand : super.getHand()) {
            if (checkHand.getSuit().equals(round.get(0).getSuit())) {
               matchingCards.add(checkHand);
            }
         }
         // if you have a matching card
         if (!matchingCards.isEmpty()) {
            int randint = (int) (Math.random() * (matchingCards.size()));
            return playCard(super.getHand().indexOf(matchingCards.get(randint)));
               
            
         } 
         // adds the hearts to matchingCards
         for (int b = 0; b < super.getHand().size(); b++) {
            if (super.getHand().get(b).getSuit().equals("hearts")) {
               matchingCards.add(super.getHand().get(b));
            }
                  
         }
         
          Card queenCard = new Card("Q", "spades", 12);
         if(super.getHand().contains(queenCard))
         {
                  return playCard(super.getHand().indexOf(queenCard));

         }
         //if you no match but heart
         if (!round.get(0).getSuit().equals("hearts") && !matchingCards.isEmpty()) {
            Card max = matchingCards.get(0);
            for(int i =0; i <matchingCards.size(); i++)
            {
            
            if(matchingCards.get(i).getRank() > max.getRank()){
            max = matchingCards.get(i);
            } 
            
            }
            return playCard(super.getHand().indexOf((max)));
          
          // not match + no heart
         } else {
            int randint = (int) (Math.random() * (super.getHand().size()));
            return playCard(randint);
         }
      
      }
   }





















}