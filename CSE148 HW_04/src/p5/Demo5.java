package p5;

import p4.Textbook;

public class Demo5
{

	public static void main(String[] args) 
	{
		Address address = new Address("1", "Main Street", "Selden", "New York", "11784");
		Faculty f1 = new Faculty("Chen", 7, 10000, address);
		
		Address a = f1.getAddress();
		a.setStreetNumber("2");
		 
		Faculty.raise(f1); // 1000 curve
		
		Address address1 = new Address("1", "Main Street", "Selden", "New York", "11784");
		Student s1 = new Student("John", 8, 2.5, address1);
		
		Student.curveGpa(s1);
		
		System.out.println(f1);
		System.out.println(" ");
		
		System.out.println(s1);
		
		System.out.println(" ");
		Textbook textbook = new Textbook("Introduction to Programming", "liang", "123-48-5678", 100);
		Textbook t1 = new Textbook(textbook);
		
		System.out.println(t1.toString()); 
		
		System.out.println(" ");
		
		Course course = new Course("CSE148", "12345", null, s1, f1);
		
		System.out.println(course);

		
	}

}
