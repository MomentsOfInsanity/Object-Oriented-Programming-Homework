package p2;

import java.util.Scanner;

public class CircleDemo 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		Circle c1 = new Circle();
		
		System.out.print("WHat is the circles radius?: ");
		c1.setRadius(input.nextDouble());
		System.out.println("Area: " + c1.getArea());
		System.out.println("Diameter: " + c1.getDiamater());
		System.out.println("Circumference: " + c1.getCircumference());
		
		
		
		input.close();

	}

}
