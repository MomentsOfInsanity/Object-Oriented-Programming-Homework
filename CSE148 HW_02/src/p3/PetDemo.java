package p3;

import java.util.Scanner;

public class PetDemo 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is the pet? 1 for Cat or 2 for Dog: ");
		int pet = input.nextInt();
		
		if(pet == 1)
		{
			Pet p1 = new Pet("Whoopi Goldberg", "Cat");
			p1.setSound();
			System.out.println(p1.toString());
			
			input.close();
		}
		else if(pet == 2)
		{
			Pet p1 = new Pet("Einstein", "Dog");
			p1.setSound();
			System.out.println(p1.toString());
			
			input.close();
		}

	}

}
