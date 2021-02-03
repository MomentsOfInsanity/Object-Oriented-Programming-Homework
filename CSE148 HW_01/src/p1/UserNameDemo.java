package p1;

import java.util.Scanner;

public class UserNameDemo 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		UserName personName = new UserName();
		
		System.out.println("What is your name? ");
		personName.setName(input.next());
		
		System.out.println("The name is " + personName.getName());
		
		input.close();

	}

}