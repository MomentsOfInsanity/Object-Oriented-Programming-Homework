package p4;

public class Demo
{

	public static void main(String[] args)
	{
		Point point1 = new Point(5, 10);
		
		point1.setXandY(7, 12);
		Point point2 = new Point(point1);
		
		point2.setX(10); 
		point2.setY(15);
		Point point3 = new Point(point2.deepCopy());
		
		Point point4 = point3.shallowCopy();
		System.out.println("Point 1 " + point1.getX() + " " + point1.getY() + " Point 2 " + point2.getX() + " " + point2.getY() + "\nPoint 3 " + point3.getX() + " " + point3.getY() + " Point 4 " + point4.getX() + " " + point4.getY());
		

	}

}
