package p5;

import java.util.Scanner;

public class BookDemo 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the title, author, and price for the first Book: ");
		Book b1 = new Book(input.next(), input.next(), input.nextDouble());
		
		System.out.print("Enter the title, author, and price for the second Book: ");
		Book b2 = new Book(input.next(), input.next(), input.nextDouble());
		b1.bookDisplay(); 
		b2.bookDisplay();
		
		input.close();
	}

}
