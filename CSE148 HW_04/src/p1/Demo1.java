package p1;

public class Demo1 
{

	public static void main(String[] args) 
	{
		Address a1 = new Address();
		System.out.println(a1.getStreetNumber() + " " + a1.getStreetName());
		System.out.println(a1.getCity());
		System.out.println(a1.getState());
		System.out.println(a1.getZip());
		
		System.out.println(" ");
		Address a2 = a1.deepCopy();
		System.out.println("a1 == a2 " + (a1 == a2));
		System.out.println(" ");
		
		System.out.println(a2.getStreetNumber() + " " + a2.getStreetName());
		System.out.println(a2.getCity());
		System.out.println(a2.getState());
		System.out.println(a2.getZip());
		
		

	}

}
