package p2;

public class Helper 
{
	private static double credits = 0;
	private static double creditsByGrade=0;
	private static double gpa;
	private static double letterGrade;
	public static double calculateGPA (Course[] course)
	{
		for (int i = 0; i < course.length; i++)
		{
			switch(course[i].getLetterGrade())
			{
			case "A": letterGrade = 4.0; 
			break;
			case "B+": letterGrade = 3.5; 
			break;
			case "B": letterGrade = 3; 
			break;
			case "C+": letterGrade = 2.5; 
			break;
			case "C": letterGrade = 2; 
			break;
			case "D+": letterGrade = 1.5; 
			break;
			case "D": letterGrade = 1; 
			break;
			default: letterGrade = 0;
			break;
			}
			creditsByGrade = creditsByGrade + letterGrade * course[i].getNumberOfCredits();
			credits = credits + course[i].getNumberOfCredits();
		}
		gpa = creditsByGrade / credits;
		creditsByGrade = 0; 
		credits = 0;
		return gpa;
	}
	/*public static double calculateGPA(int numberOfCredits, String letterGrade2) 
	{
		double letterEquivalence=0;
		switch(letterGrade)
		{
		case "A" : letterEquivalence = 4.0; break;
		case "A-" : letterEquivalence=3.7;break;
		case "B+" : letterEquivalence = 3.3; break;
		case "B" : letterEquivalence = 3.0; break;
		case "B-" : letterEquivalence = 2.7; break;
		case "C+": letterEquivalence = 2.3;break;
		case "C": letterEquivalence =2.0;break;
		case "C-" : letterEquivalence =1.7;break;
		case "D+" : letterEquivalence =1.3; break;
		case "D": letterEquivalence =1.0; break;
		default: letterEquivalence =0;break;
		}
		return credits * letterEquivalence;
		return 0;
	}*/
	

}
