package main;

import java.util.ArrayList;

public class Transcript
{
	
	private ArrayList<CourseEnrollment> courses = new ArrayList<CourseEnrollment>();
	private double gpa = 0;

	//constructor
	public Transcript()
	{
		
	}
	
	//method to add a course to the arraylist
	public void addCourse(CourseEnrollment courseEnrollment)
	{
		this.courses.add(courseEnrollment);
	}
	
	//method to get all courses
	public ArrayList<CourseEnrollment> getCourses()
	{
		return courses;
	}
	
	//method to calculate overall gpa
	public double getOverallGPA()
	{
		double totalGPA = 0;
		int totalCredit = 0;
		
		//loop through the courses
		for (int i = 0; i < getCourses().size(); i++)
		{
			//calculate totalGPA = totalGPA + (current course's gpa * credit hours)
			totalGPA = totalGPA + (CourseEnrollment.getGPAFromGrade(courses.get(i).getGrade()) * courses.get(i).getCredit());
			
			//calculate totalCredit = totalCredit + current course credit
			totalCredit = totalCredit + courses.get(i).getCredit();
		}
		
		//calculate and return overall gpa = totalGPA/totalCredit
		return totalGPA / totalCredit;
	}
	

	//format gpa string method
	public String getFormattedGPA()
	{
		return "GPA: " + String.format("%.2f", getOverallGPA());
	}
}
