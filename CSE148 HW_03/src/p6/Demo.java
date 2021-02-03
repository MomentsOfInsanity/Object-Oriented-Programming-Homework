package p6;

public class Demo 
{

	public static void main(String[] args) 
	{
		Student[] student = new Student[5];
		student[0] = new Student("Ayesha", 1.0);
		student[1] = new Student("Natalie", 2.0);
		student[2] = new Student("Asura", 3.0);
		student[3] = new Student("Phill", 4.0);
		student[4] = new Student("Glenn", 5.0);
		
		Faculty f1 = new Faculty("Ivory", 120000);
		Course course1 = new Course("CSE", "118", student, f1);
		System.out.printf("Course Name: %s %s \nProfessor: %s \nID: %s \nSalary: $%.2f\n",course1.getCourseName(), course1.getCourseNumber(), f1.getName(), f1.getId(), f1.getSalary());
		System.out.println("Students: ");
		for (int i = 0; i < 5; i++) 
		{
			System.out.printf("Name: %s | ID: %s | GPA: %.1f | \n", student[i].getName(),student[i].getId(), student[i].getGpa());
		}
		
		f1.setName("Chen"); f1.setSalary(250000);
		f1.setId("23");
		Course course2 = new Course("CSE", "148", student, f1);
		System.out.printf("\nCourse Name: %s %s \nProfessor: %s \nID: %s \nSalary: $%.2f\n",course2.getCourseName(), course2.getCourseNumber(), f1.getName(), f1.getId(), f1.getSalary());
		for (int i = 0; i < 5; i++) 
		{
			System.out.printf("Name: %s | ID: %s | GPA: %.1f | \n", student[i].getName(),student[i].getId(), student[i].getGpa());
		}
	}

}
