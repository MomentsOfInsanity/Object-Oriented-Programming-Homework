package p2;

public class Demo2 
{

	public static void main(String[] args) 
	{		
		Address address = new Address("1", "Main Street", "Selden", "New York", "11784");
		Student s1 = new Student("Adam", 7, 3.5, address);
		
		Address a = s1.getAddress();
		a.setStreetNumber("2");
		 
		Student.curveGpa(s1); // 0.2 curve
		
		Student s2 = new Student("John", 8, 2.5, a);
		Student.curveGpa(s2);
		
		System.out.println(s1);
		System.out.println(s2);


	}


}
