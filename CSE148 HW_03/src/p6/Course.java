package p6;

public class Course 
{
	private String courseName;
	private String courseNumber; 
	private Student[] students; 
	private Faculty facultyMember;
	
	public Course(String courseName, String courseNumber, Student[] students, Faculty facultyMember) 
	{
		this.courseName = courseName;
		this.courseNumber = courseNumber;
		this.students = students;
		this.facultyMember = facultyMember;
	}

	public String getCourseName() 
	{
		return courseName;
	}

	public void setCourseName(String courseName) 
	{
		this.courseName = courseName;
	}

	public String getCourseNumber() 
	{
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber)
	{
		this.courseNumber = courseNumber;
	}

	public Student[] getStudents()
	{
		return students;
	}

	public void setStudents(Student[] students)
	{
		this.students = students;
	}

	public Faculty getFacultyMember() 
	{
		return facultyMember;
	}

	public void setFacultyMember(Faculty facultyMember)
	{
		this.facultyMember = facultyMember;
	}

}
