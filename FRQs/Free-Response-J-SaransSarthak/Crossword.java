public class Crossword
{
  private Square[][] puzzle;

  /* Part (b) */

  public Crossword(boolean[][] blackSquares)
  {
    /* to be implemented in part (b) */
    int row = blackSquares.length;;
    int col = blackSquares[0].length;;

  
    puzzle = new Square[row][col];
  int numberLabel =1;
    for(int r = 0; r < puzzle.length; r++){
      for(int c = 0; c<puzzle[r].length; c++){

        boolean label = toBeLabeled(r,c,blackSquares);

        if (!label && blackSquares[r][c]){

          puzzle[r][c] = new Square(true, 0); 
        }


        else if (!label && !blackSquares[r][c]){

          puzzle[r][c] = new Square(false, 0); 
        }
        else{

          puzzle[r][c] = new Square(blackSquares[r][c], numberLabel); 
          numberLabel++;
        }


      }



    }

  }

  /* Part (a) */

  private boolean toBeLabeled(int r, int c, boolean[][] blackSquares)
  {
      /* to be implemented in part (a) */
    
if (blackSquares[r][c] == false && ( c == 0 || r==0 || blackSquares[r][c-1] == true || (r != 0 && blackSquares[r-1][c]) == true))
{
return true;

}
else{
return false;
}

  }

  public Square getSquare(int r, int c) { return puzzle[r][c]; }
}
