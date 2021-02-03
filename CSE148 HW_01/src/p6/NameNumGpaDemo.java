package p6;

import java.util.Scanner;

public class NameNumGpaDemo 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
        NameNumGpa person1 = new NameNumGpa();
        for (int i = 2; i != 1; i++) 
        {
        	System.out.printf("Enter name, gpa, and phone number: ");
            person1.setName(input.next());
            person1.setGpa(input.nextDouble());
            person1.setPhoneNumber(input.next());
            System.out.printf("Name: %s | GPA: %.1f | Phone Number: %s\n", person1.getName(), person1.getGpa(), person1.getPhoneNumber());
            System.out.print("Do you want to continue? ");
            String answer = input.next();
            if (answer.indexOf('Y') != 0) 
            {
                break;
            }
        }

	}

}
