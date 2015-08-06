package test;

import static org.junit.Assert.*;
import main.CourseEnrollment;

import org.junit.Test;

public class CourseEnrollmentTest
{

	@Test
	public void testGetGPAFromGrade()
	{
		assertTrue(CourseEnrollment.getGPAFromGrade("A") == 4.0);
		assertTrue(CourseEnrollment.getGPAFromGrade("B") == 3.0);
		assertTrue(CourseEnrollment.getGPAFromGrade("C") == 2.0);
		assertTrue(CourseEnrollment.getGPAFromGrade("F") == 0.0);
		assertTrue(CourseEnrollment.getGPAFromGrade("K") == 0.0);
	}
	
	@Test
	public void testPassNothing()
	{
		assertTrue(CourseEnrollment.getGPAFromGrade("") == 0);
	}

}
