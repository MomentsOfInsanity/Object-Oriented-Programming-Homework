package p1;

public class Address 
{
	private String streetNumber;
	private String streetName;
	private String city;
	private String state;
	private String zip;
	
	// The Constructor Method
	public Address(String streetNumber, String streetName, String city, String state, String zip) 
	{
		super();
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	 //no arg constructor
    public Address()
    {
        streetNumber = "280";
        streetName = "Greenbelt Parkway";
        city = "Holtsville";
        state = "New York";
        zip = "11742";
    }

	public String getStreetNumber() 
	{
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) 
	{
		this.streetNumber = streetNumber;
	}

	public String getStreetName() 
	{
		return streetName;
	}

	public void setStreetName(String streetName) 
	{
		this.streetName = streetName;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getState() 
	{
		return state;
	}

	public void setState(String state) 
	{
		this.state = state;
	}

	public String getZip()
	{
		return zip;
	}

	public void setZip(String zip) 
	{
		this.zip = zip;
	}
	
	public Address deepCopy()
	{
		return new Address(this.streetNumber, this.streetName, this.city, this.state, this.zip);
	}

	@Override
	public String toString()
	{
		return "Address [streetNumber=" + streetNumber + ", streetName=" + streetName + ", city=" + city + ", state="
				+ state + ", zip=" + zip + "]";
	}
	
	

}
