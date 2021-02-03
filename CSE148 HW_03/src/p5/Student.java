package p5;

public class Student 
{
	private String name;
	private String id;
	private double gpa;
	
	private static int idNumber = 0;
	
	public Student(String name, double gpa)
	{
		this.name = name;
		id = String.valueOf(idNumber++);
		this.gpa = gpa;
	}
	
	public Student(Student student)
	{
		this.name = student.name;
		this.gpa = student.gpa;
		id = String.valueOf(idNumber++);
		
		
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getId()
	{
		return id;
	}
	
	public void setId(String id) 
	{
		this.id = id;
	}
	
	
	
	public static int getIdNumber() 
	{
		return idNumber;
	}

	public static void setIdNumber(int idNumber)
{
		Student.idNumber = idNumber;
	}

	public double getGpa()
	{
		return gpa;
	}
	
	public void setGpa(double gpa) 
	{
		this.gpa = gpa;
	}
	
	public Student shallowCopy()
	{
		return this;
	}
	
	public Student deepCopy()
	{
		return new Student(this.name, this.gpa);
	}
	
	
	
}
