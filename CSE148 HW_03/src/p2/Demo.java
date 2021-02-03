package p2;

public class Demo 
{

	public static void main(String[] args) 
	{
		Fan f1 = new Fan(1000, true, 12.0, "Blue");
		System.out.println(f1.toString());
		Fan f2 = new Fan(2000, true, 5.0, "Blue");
		System.out.println(f2.toString() + " Fan is off");
		
	
	}

}
