package p1;

public class Pet 
{
	private String name;
	private String type;
	private String age;
	
	public Pet(String name, String type, int age) 
	{
		super();
		this.name = name;
		this.type = type;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Pet() 
    {
        name = "";
    }
	public String setNameTo (String newName) 
    {
        name = newName; return name;
    }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String string) {
		this.age = string;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", type=" + type + ", age=" + age + "]";
	}
	
	
	
	

}
