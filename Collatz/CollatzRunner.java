import java.util.Arrays;

public class CollatzRunner
{

public static void main(String args[])
{
Collatz x = new Collatz(10);


System.out.println(x.steps());

System.out.println(Arrays.toString(x.sequence()));

System.out.println(x.maxValue());
System.out.println(x.minOddValue());

System.out.println(Arrays.toString(x.oddValues()));

System.out.println(x.sumValues());
System.out.println(x.toString());


}















}