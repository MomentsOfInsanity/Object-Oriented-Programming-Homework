package p10;

public class Circle 
{
	private double radius;

	public Circle(double radius)
	{
		super();
		this.radius = radius;
	}

	public double getRadius()
	{
		return radius;
	}

	public void setRadius(double radius) 
	{
		this.radius = radius;
	}
	
	public double calcArea()
	{
		return radius * radius * Math.PI;
	}

	@Override
	public String toString() 
	{
		return "Circle [radius=" + radius + "]";
	}
	
}
