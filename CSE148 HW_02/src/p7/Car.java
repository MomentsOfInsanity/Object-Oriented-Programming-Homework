package p7;

public class Car 
{
	private String color; 
	private String year; 
	private String make; 
	private double speed;
	
	public Car(String color, String year, String make, double speed)
	{
		super();
		this.color = color;
		this.year = year;
		this.make = make;
		this.speed = speed;
	}

	public String getColor() 
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public String getYear() 
	{
		return year;
	}

	public void setYear(String year) 
	{
		this.year = year;
	}

	public String getMake() 
	{
		return make;
	}

	public void setMake(String make)
	{
		this.make = make;
	}

	public double getSpeed() 
	{
		return speed;
	}

	public void setSpeed(double speed) 
	{
		this.speed = speed;
	}
	public void speedUp() 
	{
		this.speed = speed + 10;
	}
	public void slowDown() 
	{
		this.speed = speed - 10;
	}

	@Override
	public String toString() 
	{
		return "Car [color=" + color + ", year=" + year + ", make=" + make + ", speed=" + speed + "]";
	}

}
