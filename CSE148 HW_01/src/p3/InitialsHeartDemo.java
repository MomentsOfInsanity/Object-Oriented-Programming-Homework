package p3;

import java.util.Scanner;

import p2.MultipleUsers;

public class InitialsHeartDemo 
{

	public static void main(String[] args) 
	{
		 Scanner input = new Scanner(System.in);
	     InitialHearts person1 = new InitialHearts(); InitialHearts person2 = new InitialHearts();
	     
	     System.out.print("Please enter your name and the name of your significant other: ");
	     System.out.println(person1.setNameTo(input.next()) + " \u2764 "+ person2.setNameTo(input.next()));
	     
	     input.close();
	}

}
