package p6;

public class Persons 
{
	private String name; 
	private String socialSecurityNumber; 
	private int age;
	
	public Persons(String name, String socialSecurityNumber, int age) 
	{
		super();
		this.name = name;
		this.socialSecurityNumber = socialSecurityNumber;
		this.age = age;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getSocialSecurityNumber()
	{
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) 
	{
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	@Override
	public String toString()
	{
		return "Persons [name=" + name + ", socialSecurityNumber=" + socialSecurityNumber + ", age=" + age + "]";
	}
	
	
	

}
