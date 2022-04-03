public class SaransSMorocco extends AbstractLocale {

private AbstractLocale ablocal;

public SaransSMorocco()
{

super("Morocco", "Arabic");

}

public SaransSMorocco(String location, String language)
{

super(location  , language);

}


public  String getLocalTime(int hour, int min){
hour += 6;

return "" + hour%24 + ":" + min; 

}


public  String getGreeting(){

return "Ssalamu 'lekum";

}


public  String getCurrencySymbol(){

return "MAD";
}


public  double getCurrencyValue(double dollarAmount){

return dollarAmount*9.72;

}







}