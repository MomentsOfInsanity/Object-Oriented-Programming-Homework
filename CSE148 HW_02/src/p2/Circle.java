package p2;

public class Circle 
{
	private double radius;
	private double Pi = 3.14159;
	
	public Circle() 
	{
		radius = 1;
	}

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

	public double getArea() 
	{
		double area = Pi * Math.pow(radius, 2);
		return area;
	}
	
	public double getDiamater() 
	{
		double diameter = radius * 2;
		return diameter;
	}
	
	public double getCircumference() 
	{
		double circumference = 2 * Pi * radius;
		return circumference;
	}
	
}
	
