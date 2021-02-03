package p2;

public class Demo 
{

	public static void main(String[] args)
	{
		Course[] courses = new Course[3];
		courses[0] = new Course("CSE 148", 4, "A");
		courses[1] = new Course("cse 118", 3, "A");
		courses[2] = new Course("MAT141", 4, "D+");
		System.out.println(Helper.calculateGPA(courses));
	}

}
