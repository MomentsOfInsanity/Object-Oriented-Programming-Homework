package p4;

public class Point
{
	private double x;
	private double y; 
	
	public Point(double x, double y) 
	{
		this.x = x;
		this.y = y;
	}


	public Point(Point point) 
	{ 
		this.x = point.getX();
		this.y = point.getY();
	}
	

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setXandY(double x, double y) 
	{
		this.x = x; this.y = y;
	}
	
	public Point deepCopy() 
	{ 
		return new Point(this.getX(), this.getY());
	}
	
	public Point shallowCopy()
	{ 
		return this;
	}
	
	

}
