import java.util.*;

public class CardPlayerLevel1 extends CardPlayer
{

   public CardPlayerLevel1 (String name, int score, ArrayList<Card> hand) {
      super(name,score,hand);
   
   
   }






   public Card chooseCard (ArrayList<Card> round, ArrayList<Card> gameCards) {
      // removes the 2 Club if you have it in super.getHand()
      Card startBalls = new Card("2", "clubs", 2);
      // if you start game
      if (gameCards.isEmpty() && super.getHand().contains(startBalls)) {
      
         return playCard(super.getHand().indexOf(startBalls));
      
      }
      // if ur the first palyer in round
      else if (round.isEmpty() && !gameCards.isEmpty()) {
         int randint = (int) (Math.random() * (super.getHand().size()));
         return playCard(randint);
      
      }
      
      else {
      //adds matching cards to nuts
         ArrayList<Card> nuts = new ArrayList<Card>();
         for (Card checkHand : super.getHand()) {
            if (checkHand.getSuit().equals(round.get(0).getSuit())) {
               nuts.add(checkHand);
            }
         }
         // if you have a matching card
         if (!nuts.isEmpty()) {
            int randint = (int) (Math.random() * (nuts.size()));
            return playCard(super.getHand().indexOf(nuts.get(randint)));
               
            
         } 
         // adds the hearts to nuts
         for (int b = 0; b < super.getHand().size(); b++) {
            if (super.getHand().get(b).getSuit().equals("hearts")) {
               nuts.add(super.getHand().get(b));
            }
                  
         }
         
          Card queenBalls = new Card("Q", "spades", 12);
         if(super.getHand().contains(queenBalls))
         {
                  return playCard(super.getHand().indexOf(queenBalls));

         }
         //if you no match but heart
         if (!round.get(0).getSuit().equals("hearts") && !nuts.isEmpty()) {
            Card max = nuts.get(0);
            for(int i =0; i <nuts.size(); i++)
            {
            
            if(nuts.get(i).getRank() > max.getRank()){
            max = nuts.get(i);
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