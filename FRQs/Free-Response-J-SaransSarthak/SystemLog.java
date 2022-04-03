import java.util.List;
import java.util.ArrayList;

public class SystemLog
{
  private List<LogMessage> messageList;

  public SystemLog(String[] messages)
  {
    messageList = new ArrayList<LogMessage>();
    for (String s : messages)
      messageList.add(new LogMessage(s));
  }

  /* Part (c) */

  public List<LogMessage> removeMessages(String keyword)
  {
      /* to be implemented in part (c) */
    int occurence = 0;

for(int i = 0; i <messageList.size(); i++){

	if (messageList.get(i).containsWord(keyword))
	{
		occurence++;
	}

}
if (occurence > 0){
List<LogMessage> removedMessages = new ArrayList<LogMessage>();


for (int i = 0; i < messageList.size(); i++)
{
if (messageList.get(i).containsWord(keyword)){
removedMessages.add(messageList.get(i));
}

}
for (int i = 0; i <removedMessages.size(); i++){
  messageList.remove(messageList.indexOf(removedMessages.get(i)));

  }

return removedMessages;
  }
  


else {
List<LogMessage> removedMessages = new ArrayList<LogMessage>();
return removedMessages;


}
  }

  public String toString()
  {
    String s = "";
    for (LogMessage msg : messageList)
      s += msg + "\n";
    return s;
  }

}
