import java.util.ArrayList;

/* Part (a) */
import java.util.*;
	public class RandomStringChooser{
	
	private String[] stringList;
	
	public RandomStringChooser() {
	
	stringList = new String[0];
	
	}
	public RandomStringChooser(String[] a) {
	
	stringList = a;
	
	}
	
	public String getNext(){
	
	return stringList[(int) (Math.random()*stringList.length)];
	

	
	}

	
	}