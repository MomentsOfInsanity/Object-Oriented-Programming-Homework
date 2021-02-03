package p1;

public class Utilities 
{
	public static double calculateCelcius (double fahrenheit) 
	{
		return (fahrenheit - 32)/(9/5);
		
	}
	public static double calculateFahrenheit (double celcius) 
	{
		return (celcius * (9/5)) + 32;
	}

}
