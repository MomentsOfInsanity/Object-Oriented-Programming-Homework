package p8;

import java.util.Scanner;

public class RectangleDemo 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first rooms dimensions (x,y): ");
		Rectangle s1 = new Rectangle(input.nextDouble(), input.nextDouble());
		
		System.out.print("Enter the second room dimensions (x,y): ");
		Rectangle s2 = new Rectangle(input.nextDouble(), input.nextDouble());
		
		System.out.print("Enter the thirds room dimensions (x,y): ");
		Rectangle s3 = new Rectangle(input.nextDouble(), input.nextDouble());
		
		System.out.printf("The total area of all three rooms is %.2f", s1.getX() * s1.getY() + s2.getX() * s2.getY() + s3.getX() * s3.getY());
		
		input.close();
		

	}

}
