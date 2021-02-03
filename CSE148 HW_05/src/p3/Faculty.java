package p3;

public class Faculty extends Person 
{
	private double salary;

	public Faculty(String name,  double salary) 
	{
		super(name);
		this.salary = salary;
	}
	
	public Faculty()
	{
		super();
	}

	public double getSalary()
	{
		return salary;
	}

	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
	
	@Override
	public String toString()
	{
		return "Faculty [name= " + this.getName() + " Id= " + this.getId() +" salary= " + salary + "]";
	}

}
