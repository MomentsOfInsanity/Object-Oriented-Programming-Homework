package p5;

public class Course 
{
	private String courseTitle;
	private String crn;
	private Textbook textbook;
	private Student student;
	private Faculty faculty;
	
	public Course(String courseTitle, String crn, Textbook textbook, Student student, Faculty faculty) 
	{
		super();
		this.courseTitle = courseTitle;
		this.crn = crn;
		this.textbook = textbook;
		this.student = student;
		this.faculty = faculty;
	}
	
	public Course(Course course) 
	{
		this.courseTitle = course.courseTitle;
		this.crn = course.crn;
	
	}
	

	public String getCourseTitle() 
	{
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) 
	{
		this.courseTitle = courseTitle;
	}

	public String getCrn() 
	{
		return crn;
	}

	public void setCrn(String crn)
	{
		this.crn = crn;
	}

	public Textbook getTextbook() 
	{
		return textbook;
	}

	public void setTextbook(Textbook textbook) 
	{
		this.textbook = textbook;
	}

	public Student getStudent()
	{
		return new Student(student);
	}

	public void setStudent(Student student)
	{
		this.student = student;
	}

	public Faculty getFaculty() 
	{
		return new Faculty(faculty);
	}

	public void setFaculty(Faculty faculty)
	{
		this.faculty = faculty;
	}

	@Override
	public String toString()
{
		return "Course [courseTitle=" + courseTitle + ", crn=" + crn + ", textbook=" + textbook + ", student=" + student
				+ ", faculty=" + faculty + "]";
	}
	
	
	
	

}
