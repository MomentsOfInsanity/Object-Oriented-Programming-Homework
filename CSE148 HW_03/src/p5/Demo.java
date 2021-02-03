package p5;

public class Demo
{

	public static void main(String[] args) 
	{
		Student s1 = new Student("John", 3.0);
		Student s2 = (s1);
		s1.setIdNumber(1);
		System.out.println(s1.getName() + " " + s1.getId() + " " + s1.getGpa() +" First line");
		
		System.out.println(s2 == s1);
		System.out.println(s2.getName() + " " + s2.getId() + " " + s2.getGpa() + " Shallow copy of First line");
		System.out.println(" ");
		
		Student s3 = s1.deepCopy();
		System.out.println(s1 == s3);
		
		//s3.setName("Adam");
		//s3.setGpa(3.5);
		System.out.println(s3.getName() + " " + s3.getId() + " " + s3.getGpa() + " Deep copy of First line");
		System.out.println(" ");
		
		Student s4 = new Student(s1);
		System.out.println(s1 == s4);
		System.out.println(s4.getName() + " " + s4.getId() + " " + s4.getGpa() + " Deep copy of First line");
		
	
	}
	
	
	

}
