package p6;

public class NameNumGpa 
{
	private String name;
	private String phoneNumber;
	private double gpa;
	
	public void setAll(String newName, String newPhoneNumber, double newGpa)
	{
		name = newName;
		phoneNumber = newPhoneNumber;
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
	
	public void setPhoneNumber(String newPhoneNumber)
	{
		phoneNumber = newPhoneNumber;
	}
	
	public String getPhoneNumber()
	{
		return phoneNumber;
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
		return "Name: " + name + "\tPhone: " + phoneNumber + "\tGPA: " + gpa; 
	}
}

