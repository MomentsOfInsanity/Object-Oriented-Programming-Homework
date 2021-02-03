package p4;

public class Demo4 
{
	public static void main(String[] args) 
	{
	Textbook textbook = new Textbook("Introduction to Programming", "liang", "123-48-5678", 100);
	Textbook t1 = new Textbook(textbook);
	
	System.out.println(t1.toString()); 
	}
	

}
