package main;

import java.util.ArrayList;
import java.util.Scanner;

public class TranscriptApp
{
	public static void main(String[] args)
	{
		//set initial value of hasMoreCourse to true
		boolean hasMoreCourse = true;
		
		//initialize transcript
		Transcript transcript = new Transcript();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to the transcript application.");
		
		//while user still has more course, continue the loop
		while(hasMoreCourse)
		{
			//call getInputfromuser method
			CourseEnrollment course = getInputFromUser(keyboard);
			
			//add course to transcript
			transcript.addCourse(course);
			
			//prompt user to see if there's another course
			hasMoreCourse = Validator.getBoolean(keyboard, "Another course? (y/n): ");
		}
		
		//call print transcript method
		printOutTranscript(transcript);
	}
	
	//method to receive input from user, return a course object
	public static CourseEnrollment getInputFromUser(Scanner keyboard)
	{
		CourseEnrollment course = new CourseEnrollment();
		course.setCourseCode(Validator.getString(keyboard, "Enter course: "));
		course.setCredit(Validator.getInt(keyboard, "Enter credits: ",0,6));
		keyboard.nextLine();
		course.setGrade(Validator.getString(keyboard, "Enter grade: "));
		return course;
	}
	
	//method to format and print out transcript to console
	private static void printOutTranscript(Transcript transcript)
	{
		ArrayList<CourseEnrollment> courses = transcript.getCourses();
		System.out.format("%-20s%-10s%-10s%-10s", "Course","Credits","Grade","Quality Points");
		System.out.println();
		System.out.format("%-20s%-10s%-10s%-10s","------","-----","-----","-----");
		System.out.println();
		for(int i = 0; i < courses.size(); i++)
		{
			CourseEnrollment course = courses.get(i);
			System.out.format("%-20s%-10s%-10s%-10s",
								course.getCourseCode(),
								course.getCredit(),
								course.getGrade(),
								course.getGPAFromGrade(course.getGrade()));
			System.out.println();
		}
		System.out.format("%-50s%-10s", "", transcript.getFormattedGPA());
	}
}
