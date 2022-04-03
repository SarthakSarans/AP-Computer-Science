public class CardGameRunner {

  public static void main(String[] args) {
    boolean printGameByGame = true;
    int numGames = 2000;
    int numShufflesPerGame = 100;   // use 100 if using OLD shuffle, 1 time if using NEW shuffle (aka Collections.shuffle())
 
    String[] names = {"Player0","Player1","Player2","Player3"};
    CardGame game = new CardGame("Hearts",4,names,0);
    System.out.println(game);
    for (int i=1; i <= numGames; i++) {
       game.getDeckOfCards().initializeDeck();
       for (int j=0; j < numShufflesPerGame; j++) {
          game.getDeckOfCards().shuffle();  // if using homemade shuffle have to do it about 100 times to get good results
       }
       game.deal(13,0);
       game.deal(13,1);
       game.deal(13,2);
       game.deal(13,3);

       // INFO
       //System.out.println(game);
       game.playGame();
       System.out.println("Game number:" + i);
       //if (printGameByGame) {
       if (printGameByGame && (i % 1000 == 0)) {
          System.out.print("Game number " + i + "  -> ");
          for (int k=0; k < game.getNumberOfPlayers(); k++) {
               System.out.printf("%s %2d   ",game.getPlayers().get(k).getName(),game.getPlayers().get(k).getScore());
          }
          System.out.println();
       }
     
    }
    int total = 0;
    for (int i=0; i <= 3; i++) {
      total = total + game.getPlayers().get(i).getScore();
    }
    System.out.println("\nTotal Number of bad points = " + total);
    double percent;
    boolean outOfBounds = false;  // set to true to force printing of results
    for (int i=0; i <= 3; i++) {
      percent = ((int) ((game.getPlayers().get(i).getScore()/(double) total) * 10000))/ 100.0;
      if ((percent < 24.5) || (percent > 25.5)) {
         outOfBounds = true;
      }
    }    
   
    if (outOfBounds) {
       System.out.println("Error!!! After " + numGames + " games, a player had < 24.5% or > 25.5% of the points.");
       for (int i=0; i <= 3; i++) {
         percent = ((int) ((game.getPlayers().get(i).getScore()/(double) total) * 10000))/ 100.0;
         System.out.println("  " + game.getPlayers().get(i).getName() + " " + game.getPlayers().get(i).getScore() + " " + percent + "%");
       }    
    }
    else {
       System.out.println("After " + numGames + " games, each player had between 24.5% and 25.5% ot the points.");    
    }
  }
}