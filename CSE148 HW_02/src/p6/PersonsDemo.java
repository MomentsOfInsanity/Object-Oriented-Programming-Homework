package p6;

import java.util.Scanner;

public class PersonsDemo 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first persons name, Social Security Number, and age: ");
		Persons p1 = new Persons(input.next(), input.next(), input.nextInt());
		
		System.out.print("Enter second persons name, Social Security Number, and age: ");
		Persons p2 = new Persons(input.next(), input.next(), input.nextInt());
		
		
		System.out.println("Person #1");
		System.out.printf("Name: %s Social Security Number: %s Age: %d\n", p1.getName(), p1.getSocialSecurityNumber(), p1.getAge());
		
		System.out.println("--------------------------------------------------");
		
		System.out.println("Person #2");
		System.out.printf("Name: %s Social Security Number: %s Age: %d\n", p2.getName(), p2.getSocialSecurityNumber(), p2.getAge());
		
		input.close();

	}

}
