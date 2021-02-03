package p2;

import java.util.Scanner;

public class MultipleUsersDemo 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		MultipleUsers personsName1 = new MultipleUsers();
		
		System.out.println("What is your name? ");
		personsName1.setName(input.next());
		
		MultipleUsers personsName2 = new MultipleUsers();
		
		System.out.println("What is your significant others name? ");
		personsName2.setName(input.next());
		
		System.out.print("Your name is " + personsName1.getName() +" & ");
		System.out.println("your significant others name is " + personsName2.getName());
		
		input.close();

	}

}
