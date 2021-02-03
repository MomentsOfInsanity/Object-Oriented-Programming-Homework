package p4;

public class NameGpa 
{
	private String name;
	private String phoneNumber;
	private double gpa;
	
	public void setAll(String newName,  double newGpa)
	{
		name = newName;
		gpa = newGpa;
	}
	public void setName(String newName)
	{
		name = newName;
	}
	
	public String getName()
	{
		return name;
	}
	
	
	public void setGpa(double newGpa)
	{
		gpa = newGpa;
	}

	public double getGpa()
	{
		return gpa;
	}
	
	public String toString()
	{
		return "Name: " + name + "\tGPA: " + gpa; 
	}
}


