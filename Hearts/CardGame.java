import java.util.*;

public class CardGame{

   private Deck deckOfCards;
   private String nameOfGame;
   private ArrayList<CardPlayer> players;
   private int numberOfPlayers;
   private int currentPlayer;


   public CardGame(String b, int g, String[] play, int s)
   {
      nameOfGame = b;
      numberOfPlayers = g;
      players = new ArrayList<CardPlayer>();
      
      CardPlayer a = new CardPlayerLevel1(play[0],0,new ArrayList<Card>()); 
      CardPlayer k = new CardPlayerLevel1(play[1],0,new ArrayList<Card>());
      CardPlayer c = new CardPlayerLevel1(play[2],0,new ArrayList<Card>());
      CardPlayer d = new CardPlayerLevel1(play[3],0,new ArrayList<Card>());
      players.add(a);
      players.add(k);
      players.add(c);
      players.add(d);
   
      
      currentPlayer = s;
      deckOfCards = new Deck();
   }

   public Deck getDeckOfCards() {
      return deckOfCards;
   }
   public void setDeckOfCards(Deck inpDeck) {
      deckOfCards = inpDeck;
   }
   public String getNameOfGame() {
      return nameOfGame;
   }
   public void setNameOfGame(String inpName) {
      nameOfGame = inpName;
   }
   public ArrayList<CardPlayer> getPlayers(){
      return players;
   }
   public void setPlayers(ArrayList<CardPlayer> inpPlay) {
      players = new ArrayList<CardPlayer>(inpPlay);
   }
   public int getCurrentPlayer() {
      return currentPlayer;
   }
   public void setCurrentPlayer(int curP) {
      currentPlayer = curP;
   }
   
   public void setNumberOfPlayers(int da){
      numberOfPlayers=da;
   }
   
   public int getNumberOfPlayers()
   {
      return numberOfPlayers;
   }

   public void deal(int n, int inx){
      for (int i = 0; i<n; i++) 
      {
      
         players.get(inx).addCard(deckOfCards.dealTopCard());
      }
   
   }

   public void playGame()
   {
      //deals cards out (not needed)
     //  for(int i =0; i < numberOfPlayers; i++)
   //       {
   //          int perEach = 52/numberOfPlayers;
   //          
   //          
   //          deal(perEach,i);
   //       
   //       }
   //    
   
      //Picks the first player of the game
      
      
      for (int i = 0; i < numberOfPlayers; i++)
      {
         Card clubtwo = new Card("2", "clubs", 2);
         if (players.get(i).getHand().contains(clubtwo))
         {
            currentPlayer = i;
         }
      }
      
      //Variable for the starting game player
      int startingPlayer = 0;
      startingPlayer = currentPlayer;
      
     //Start the game and go for 13 rounds
      ArrayList<Card> playedInGame = new ArrayList<Card>();
      for (int j = 0; j < 13; j++)
      {
         //adds cards played to list for scoring
         ArrayList<Card> roundCards = new ArrayList<Card>();
         for (int p = 0; p < numberOfPlayers; p++)
         {
            Card  chosen = players.get((currentPlayer+p)%numberOfPlayers).chooseCard(roundCards,players.get((currentPlayer+p)%numberOfPlayers).getTakenCards());
            roundCards.add(chosen);
         }
         //scoring + points
         checkRound(roundCards, (startingPlayer)%numberOfPlayers);
         
         Card roundWinner = roundCards.get(0);
         for (Card played:roundCards)
         {
            String suitForRound = roundCards.get(0).getSuit();
            if(played.getSuit().equals(suitForRound))
            {
               if (roundWinner.getRank() < played.getRank())
               {
                  roundWinner = played;
               }
            }
         }
         int indexOfWinner = roundCards.indexOf(roundWinner);
         
         int winnerOfRound = (currentPlayer + indexOfWinner)%4;
         
         //Winner gets cards of Round to takenCards + total cards played
         players.get(winnerOfRound).addTakenCards(roundCards);
         playedInGame.addAll(roundCards);
         //updates the score of winner
      
         for(Card cardsTaken: roundCards)
         {
            Card qCard = new Card("Q", "spades", 12);
            if(cardsTaken.getSuit().equals("hearts"))
            {
               players.get(winnerOfRound).updateScore(1);            
            }
            if(cardsTaken.equals(qCard))
            {
               players.get(winnerOfRound).updateScore(13);            
            }
         
         
         }
      
               
         currentPlayer = winnerOfRound;

         startingPlayer = currentPlayer;
      }
   
   }
      
   

   public void checkRound(ArrayList<Card> round, int startingPlayer) {
   // System.out.print(startingPlayer + " ");
      String roundSuit = round.get(0).getSuit();  // Suit that was led
      for (int i = 1; i < round.size(); i++) {     // for all other cards played in the round
         if (!round.get(i).getSuit().equals(roundSuit)) {    
            CardPlayer player = players.get((i + startingPlayer) % round.size());
            for (Card c : player.getHand()) {   // check each card in that players hand
               if (c.getSuit().equals(roundSuit)) { 
                  System.out.println("*** DID NOT FOLLOW SUIT *** round=" + round + " played=" + round.get(i) + " hand=" + player.getHand());
                  break;
               }
            }
         }
      }
   }


   public String toString()
   {
      String printer = "";
      printer += (nameOfGame + "\n");
      for (int i=0; i < numberOfPlayers; i++)
      
      {
         printer += (players.get(i).toString() + "\n");
      
      }
      
      printer += ("deck -> " + deckOfCards);
   
      return printer;
   
   
   
   
   }





}