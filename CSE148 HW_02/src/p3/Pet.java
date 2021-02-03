package p3;

public class Pet 
{
private String name; private String type; private String sound;
	
	public Pet(String name, String type) 
	{
		super();
		this.name = name; 
		this.type = type;
		sound = null;
	}
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getType() 
	{
		return type;
	}

	public void setType(String type) 
	{
		this.type = type;
	}

	public String getSound() 
	{
		return sound;
	}

	public void setSound() 
	{
		switch (type) 
		{
		case "Dog": sound = "woofs"; 
		break;
		case "Cat": sound = "meows"; 
		break;
		}
 	}

	@Override
	public String toString() 
	{
		return "Pet [name=" + name + ", type=" + type + ", sound=" + sound + "]";
	}
	
}
