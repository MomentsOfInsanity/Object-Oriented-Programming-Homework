package p4;

import java.util.Scanner;

public class NameGpaDemo 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		NameGpaD person1 = new NameGpaD();
        for (int i = 2; i != 1; i++) 
        {
        System.out.println("Enter name: ");
        System.out.println(person1.setName(input.next()));
        System.out.println("Enter GPA: ");
        System.out.println(person1.setGpa(input.nextDouble()));
        }

	}

}
