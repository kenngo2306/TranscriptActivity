package main;
//testing it
public class CourseEnrollment
{
	private String courseCode;
	private int credit;
	private String grade;
	
	//set some constant
	private static final double A_GPA = 4.0;
	private static final double B_GPA = 3.0;
	private static final double C_GPA = 2.0;
	private static final double F_GPA = 0.0;
	private static final String A_GRADE = "A";
	private static final String B_GRADE = "B";
	private static final String C_GRADE = "C";
	private static final String F_GRADE = "F";
	
	public String getCourseCode()
	{
		return courseCode;
	}
	
	public void setCourseCode(String courseCode)
	{
		this.courseCode = courseCode;
	}
	
	public int getCredit()
	{
		return credit;
	}
	
	public void setCredit(int credit)
	{
		this.credit = credit;
	}
	
	public String getGrade()
	{
		return grade;
	}
	
	public void setGrade(String grade)
	{
		this.grade = grade;
	}
	
	//method to get gpa from a grade
	public static double getGPAFromGrade(String grade)
	{
		if(grade.equals(A_GRADE))
		{
			return A_GPA;
		}
		else if(grade.equals(B_GRADE))
		{
			return B_GPA;
		}
		else if (grade.equals(C_GRADE))
		{
			return C_GPA;
		}
		else if (grade.equals(F_GRADE))
		{
			return F_GPA;
		}
		else
		{
			return 0;
		}
	}
}
