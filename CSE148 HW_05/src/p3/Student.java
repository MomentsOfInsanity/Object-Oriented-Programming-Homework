package p3;

public class Student extends Person
{
	private double gpa;

	public Student(String name, double gpa) 
	{
		super(name);
		this.gpa = gpa;
	}
	public Student() 
	{
		super();
	}

	public double getGpa()
	{
		return gpa;
	}

	public void setGpa(double gpa) 
	{
		this.gpa = gpa;
	}
	
	@Override
	public String toString() 
	{
		return "Student [name= " + this.getName() + " Id= " + this.getId() + " gpa= " + gpa + "]";
	}
	

}
