import java.util.*;
public class LogMessage
{
  private String machineId;
  private String description;


  public LogMessage(String message)
  {
    /* to be implemented in part (a) */
   
    boolean passed = false;
for (int i = 0; i<message.length();i++)
{

if(message.charAt(i) != ':' && !passed){
  if(i ==0)
    machineId = "";
machineId += message.charAt(i);

}

else if ((message.charAt(i) != ':' && passed)){
  if(i != 0 && message.charAt(i-1) == ':')
    description = "";
description += message.charAt(i);
}

else{

passed = true;
}


}
  }

  /* Part (b) */

  public boolean containsWord(String keyword)
  {
      /* to be implemented in part (b) */
    
if (description.indexOf(keyword) != -1){
	if (description.indexOf(keyword) == 0 || description.charAt((description.indexOf(keyword)) - 1) == ' '){
		if((description.indexOf(keyword)) + keyword.length() == description.length()||description.charAt(description.indexOf(keyword)+keyword.length()) == ' ' )
		{
		return true;
		}
		
		else{
		return false;
		}
	
	
	}
	
	else{
	return false;
	}



}
else{
return false;
}
  }



  public String getMachineId()
  { return machineId; }

  public String getDescription()
  { return description; }

  public String toString()
  {
    return getMachineId() + ":" + getDescription();
  }
}
