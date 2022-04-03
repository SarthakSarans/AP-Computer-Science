import java.util.List;
import java.util.ArrayList;

public class StringFormatter
{
  /* Part (a) */

  public static int totalLetters(List<String> wordList)
  {
    /* to be implemented in part (a) */
    
int total =0;
for (int i =0; i<wordList.size(); i++){

total += wordList.get(i).length();

}

return total;
  }

  /* Part (b) */

  public static int basicGapWidth(List<String> wordList,
                                  int formattedLen)
  {
      /* to be implemented in part (b) */
    
int letters = totalLetters(wordList);
int gap = (formattedLen-letters)/(wordList.size()-1);

return gap;


  }
  /***********/
  /* Part (c) */

  public static String format(List<String> wordList, int formattedLen)
  {
      /* to be implemented in part (c) */
    
String formatted = "";
      int leftSpaces = leftoverSpaces(wordList, formattedLen);


for(int i =0; i < wordList.size(); i++){

  formatted += (wordList.get(i));
  
  for (int k = 0; k < basicGapWidth(wordList, formattedLen); k++ ){

    formatted += " ";
  }
  if (leftSpaces > 0){
    formatted+= " ";
      leftSpaces--;
  }
    

}
    return formatted;
  }
  
  public static int leftoverSpaces(List<String> wordList, int formattedLen)
  {
    return formattedLen - totalLetters(wordList) -
                 basicGapWidth(wordList, formattedLen) * (wordList.size() - 1);
  }


}
