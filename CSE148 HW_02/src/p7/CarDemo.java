package p7;

import java.util.Scanner;

public class CarDemo 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the car's Color, Year, Make and Speed: ");
		Car c1 = new Car(input.next(), input.next(), input.next(), input.nextDouble());
		
		System.out.println(c1.toString());
		
		c1.speedUp(); 
		c1.speedUp(); 
		c1.speedUp();
		c1.speedUp(); 
		c1.speedUp();
		c1.slowDown(); 
		c1.slowDown(); 
		c1.slowDown(); 
		c1.slowDown();
		System.out.print(c1.toString());
		
		input.close();

	}

}
