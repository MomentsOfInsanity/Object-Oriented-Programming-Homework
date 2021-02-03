package p3;

public class PersonBag
{
	
	private Person[] personArray = new Person[10];
	
	int counter = 0;
	
	public void insertPerson(Person person)
	{
		if (personArray[counter] == null)
		{
		personArray[counter] = person;
		counter++;
		}
	}
	
	public Person findPersonById(String id)
	{
		for(int i =0; i < counter; i++ ) 
		{
			if(personArray[i] instanceof Person && id.equals(personArray[i].getId())) 
			{
			return personArray[i];
			}
		}
		return null;
	}
	
	public Person findPersonByName(String name) 
	{
		for(int i =0; i < counter; i++ ) 
		{
			if(personArray[i] instanceof Person && name.equals(personArray[i].getName())) 
			{
			return personArray[i];
			}
		}
		return null;
	}
	
	public Student findStudentById(String id)
	{
		for(int i =0; i < counter; i++ ) 
		{
			if(personArray[i] instanceof Student && id.equals(personArray[i].getId())) 
			{
			return (Student) personArray[i];
			}
		}
		return null;	
	}
	
	public Student findStudentByName(String name)
	{
		for(int i =0; i < counter; i++ )
		{
			if(personArray[i] instanceof Student && name.equals(personArray[i].getName())) 
			{
			return (Student) personArray[i];
			}
		}
		return null;
	}
	
	public Person deletePersonById(String id) 
	{
		for(int i =0; i < counter; i++ ) {
			if(id.equals(personArray[i].getId()))
			{
			personArray[i] = null;
			}
		}
		return null;
	}
	
	public Student deleteStudentById(String id) 
	{
		for(int i =0; i < counter; i++ ) 
		{
			if(personArray[i] instanceof Student && id.equals(personArray[i].getId()))
			{
			personArray[i] = null;
			}
		}
		return null;
	}
	
}
