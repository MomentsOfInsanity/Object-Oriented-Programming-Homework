package p1;

public class Person 
{
	private String name;
	private String address;
	private double age;
	private String number;
	
	public Person() 
	{
		name = ""; address = ""; age = 0; number = "";
	}
	
	public Person(String name, String address, double age, String number) 
	{
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.number = number;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	public double getAge() 
	{
		return age;
	}

	public void setAge(double age) 
	{
		this.age = age;
	}

	public String getNumber()
	{
		return number;
	}

	public void setNumber(String number) 
	{
		this.number = number;
	}

	public void print(String name, int address, String age, String number) 
	{
		System.out.println("\nName: " + name +  "\nAge: " + address + "\nAddress: " + age + "\nPhone Number: " + number);
	}
	
	
	
	

}
