package p3;

public class Demo 
{

	public static void main(String[] args) 
	{
		
		Faculty f1 = new Faculty("CHEN", 100000);
		Faculty f2 = new Faculty("FULTON", 70000);
		Faculty f3 = new Faculty("ADAMS", 75000);
		Faculty f4 = new Faculty("JACOBSEN", 80000);
		Faculty f5 = new Faculty("LYDIA", 90000);
		Student s1 = new Student("Raj Bedi" , 4.0);
		Student s2 = new Student("WanWan Xu" , 3.5);
		Student s3 = new Student("Ayesha Attique" , 3.0);
		Student s4 = new Student("Raidah Zaman" , 3.5);
		Student s5 = new Student("John Smith" , 2.0);

		PersonBag personBag = new PersonBag();
		
		personBag.insertPerson(f1);
		personBag.insertPerson(f2);
		personBag.insertPerson(f3);
		personBag.insertPerson(f4);
		personBag.insertPerson(f5);
		personBag.insertPerson(s1);
		personBag.insertPerson(s2);
		personBag.insertPerson(s3);
		personBag.insertPerson(s4);
		personBag.insertPerson(s5);

		System.out.println(personBag.findPersonById("1"));
		System.out.println(personBag.findPersonByName("Raj Bedi"));
		System.out.println(personBag.findStudentById("6"));
		System.out.println(personBag.findStudentByName("Raidah Zaman"));
		
		System.out.println("Deleting...");
		personBag.deletePersonById("1");
		personBag.deleteStudentById("6");
		System.out.println("Now printing deleted people...");
		System.out.println(personBag.findPersonById("1"));
		System.out.println(personBag.findPersonById("6"));
	}

}
