package p4;

public class CurvaGpaDemo 
{

	public static void main(String[] args) 
	{
		Student s1 = new Student("mack", 3.4);
		s1.curveGPA(0.2);
		System.out.println("Student: "+ s1.getName());
		System.out.println("GPA: "+ s1.getGpa());

	}
	
	

}
