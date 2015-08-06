package test;

import static org.junit.Assert.*;

import java.util.Scanner;

import main.CourseEnrollment;
import main.TranscriptApp;

import org.junit.Test;

public class TranscriptAppTest
{

	@Test
	public void testGetInputFromUser()
	{
		Scanner keyboard = new Scanner(System.in);
		CourseEnrollment course = new CourseEnrollment();
		course.setCourseCode("java");
		course.setCredit(3);
		course.setGrade("A");
		
		CourseEnrollment course2 = TranscriptApp.getInputFromUser(keyboard);
		assertTrue(course.getCourseCode().equals(course2.getCourseCode()));
		assertTrue(course.getCredit() == course2.getCredit());
		assertTrue(course.getGrade().equals(course2.getGrade()));	
	}

}
