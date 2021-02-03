package p3;

public class Person
{
	private String name;
	private String id;
	
	private static int idNumber = 0;

	public Person(String name)
	{
		super();
		this.name = name;
		id = String.valueOf(idNumber++);
	}
	
	public Person()
	{
		super();
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
	
	

}
