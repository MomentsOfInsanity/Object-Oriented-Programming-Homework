package p10;

import java.util.Scanner;
import java.util.Random;

public class GuessNumbers 
{

	public static void main(String[] args) 
	{
		Random generator = new Random();
		Scanner input = new Scanner(System.in);
		
		String playAgain = "";

		int higher = 1;
		int lower = 2; 
		int correct = 3;
		int random;
		for (int i = 2; i != 1; i++)
		{
			random = generator.nextInt(100) + 1;
			
			System.out.println("Pick a number between 1 and 100");
			System.out.println("The number is: " + random);
			System.out.println("Should the number be higher(1), lower(2), or is it correct(3): ");
			int decision = input.nextInt();
			
			if(decision == 1)
			{
				System.out.println("Is the number higher then or equal to 50?");
				
			}
			
			else if(decision ==3)
			{
				System.out.println("This is the correct number. Do you want to try again. Yes(1) or No(2)");
				System.out.print("Do you want to continue? ");
	            String tryAgain = input.next();
	            if (tryAgain.indexOf('1') != 0) 
	            {
	                break;
	            }
			}
		
			
		}
			
			
		}

}



