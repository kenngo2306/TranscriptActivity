package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Random;

import main.CourseEnrollment;
import main.Transcript;

import org.junit.Test;

public class TranscriptTest
{
	@Test (timeout = 5000)
	public void stressTestCalculateGPA()
	{
		System.out.println("Stress testing...");
		Random r = new Random();
		Transcript transcript = new Transcript();
		for (int i = 1; i <= 1000000; i ++)
		{
			CourseEnrollment course = new CourseEnrollment();
			course.setCourseCode("course " + i);
			course.setCredit(1+r.nextInt(5));
			course.setGrade(getRandomGrade());
			transcript.addCourse(course);
		}
		System.out.println(transcript.getOverallGPA());
	}
	
	public String getRandomGrade()
	{
		Random r = new Random();
		int gradeCode = 1 + r.nextInt(4);
		String grade = "A";
		switch(gradeCode)
		{
			case 1: grade = "A";
				break;
			case 2: grade = "B";
				break;
			case 3: grade = "C";
				break;
			default: grade = "F";
				break;
		}
		return grade;
	}
	

	@Test 
	public void testAddCourse()
	{
		System.out.println("Test add course...");
		Transcript transcript = new Transcript();
		assertTrue(transcript.getCourses().size() == 0);
		
		CourseEnrollment course = new CourseEnrollment();
		
		transcript.addCourse(course);
		assertTrue(transcript.getCourses().size() == 1);
		assertTrue(transcript.getCourses().get(0).equals(course));
	}
	
	@Test(timeout = 1000)
	public void testAdd1000Course()
	{
		System.out.println("Test add 1000 course...");
		Transcript transcript = new Transcript();
		assertTrue(transcript.getCourses().size() == 0);
		
		
		
		for (int i = 1; i <= 1000; i++)
		{
			CourseEnrollment course = new CourseEnrollment();
			course.setCourseCode("course " + i);
			transcript.addCourse(course);
		}
		
		assertTrue(transcript.getCourses().size() == 1000);
		assertTrue(transcript.getCourses().get(999).getCourseCode().equals("course 1000"));
	}

	@Test
	public void testGetCourses()
	{
		System.out.println("test get courses...");
		Transcript transcript = new Transcript();
		CourseEnrollment course = new CourseEnrollment();
		course.setCourseCode("java");
		CourseEnrollment course2 = new CourseEnrollment();
		course2.setCourseCode("java ee");
		transcript.addCourse(course);
		transcript.addCourse(course2);
		
		ArrayList<CourseEnrollment> courses = transcript.getCourses();
		assertTrue(courses.size() == 2);
		assertTrue(courses.get(0).getCourseCode().equals("java"));
		assertTrue(courses.get(1).getCourseCode().equals("java ee"));
	}

	@Test
	public void testGetOverallGPA()
	{
		System.out.println("test get overall gpa...");
		Transcript transcript = new Transcript();
		
		CourseEnrollment course = new CourseEnrollment();
		course.setCourseCode("java");
		course.setCredit(3);
		course.setGrade("A");
		
		CourseEnrollment course2 = new CourseEnrollment();
		course2.setCourseCode("java ee");
		course2.setCredit(5);
		course2.setGrade("C");
		
		transcript.addCourse(course);
		transcript.addCourse(course2);
		
		double i = transcript.getOverallGPA();
		assertTrue(transcript.getOverallGPA() == 2.75);
		
	}

	@Test
	public void testGetFormattedGPA()
	{
		System.out.println("test get formatted overall gpa...");
		Transcript transcript = new Transcript();
		
		CourseEnrollment course = new CourseEnrollment();
		course.setCourseCode("java");
		course.setCredit(3);
		course.setGrade("A");
		
		CourseEnrollment course2 = new CourseEnrollment();
		course2.setCourseCode("java ee");
		course2.setCredit(5);
		course2.setGrade("C");
		
		transcript.addCourse(course);
		transcript.addCourse(course2);
		assertTrue(transcript.getFormattedGPA().equals("GPA: 2.75"));
	}

}
