package p1;

import java.util.Scanner;

public class Demo 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Pet p1 = new Pet(); 
		Pet p2 = new Pet();
		System.out.print("Please enter name of pet: ");
		p1.setNameTo(input.next());
		
		System.out.print("Please enter type of pet: ");
		p1.setType(input.next());
		
		System.out.print("Please enter age of pet: ");
		p1.setAge(input.next());
		
		System.out.print(p1.getName()+ " " + p1.getType()+ " " + p1.getAge());
		
		
		//Pet p1 = new Pet("John", "Cat", 4);
	}
	
	

}
