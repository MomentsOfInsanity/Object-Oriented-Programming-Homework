package p1;

import java.util.Scanner;

public class PersonDemo 
{

	public static void main(String[] args) 
	{
		Person p1 = new Person();
		Person p2 = new Person();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your Name, Address, Age, and Phone Number: ");
		p1.setName(input.next()); 
		p1.setAddress(input.next());
		p1.setAge(input.nextDouble()); 
		p1.setNumber(input.next());
		
		System.out.print("Enter the name of your friends Name, Age, Address, and Phone Number: ");
		p2.setName(input.next()); 
		p2.setAddress(input.next()); 
		p2.setAge(input.nextDouble()); 
		p2.setNumber(input.next());
		
		System.out.println(p1.getName());
		System.out.println(p1.getAddress());
		System.out.println(p1.getAge());
		System.out.println(p1.getNumber());
		
		System.out.println(p2.getName());
		System.out.println(p2.getAddress());
		System.out.println(p2.getAge());
		System.out.println(p2.getNumber());
		
		input.close();


	}

}
