package p3;

public class Faculty
{
	private String name;
	private int id;
	private double salary;
	private Address address;
	private Student student;
	private static double raise = 1000;
	
	public Faculty(String name, int id, double salary, Address address) 
	{
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.address = address;
	}
	
	 public Faculty()
	    {
	        name = "Chen";
	        id = 25;
	        salary = 10000;
	    }
	
	public static void raise(Faculty faculty) 
	{
		faculty.salary = faculty.getSalary() + raise;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public double getSalary() 
	{
		return salary;
	}

	public void setSalary(double salary) 
	{
		this.salary = salary;
	}

	public Address getAddress() 
	{
		return address;
	}

	public void setAddress(Address address) 
	{
		this.address = address;
	}
	
	public Student getStudent() 
	{
		//return address; // shallow copy
		return new Student(student); // deep copy
	}
	
	public void setStudent(Student student) 
	{
		this.student = student;
	}

	@Override
	public String toString() 
	{
		return "Faculty [name=" + name + ", id=" + id + ", salary=" + salary + ", address=" + address + "]";
	}
	
	
	
}
