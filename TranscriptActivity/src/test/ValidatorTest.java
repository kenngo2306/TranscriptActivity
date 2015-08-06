package test;

import static org.junit.Assert.*;

import java.util.Scanner;

import main.Validator;

import org.junit.Test;

public class ValidatorTest
{

	@Test
	public void testGetString()
	{
		Scanner keyboard = new Scanner(System.in);
		assertTrue(Validator.getString(keyboard, "Enter sth: ").getClass().getName().equals("java.lang.String"));
		
	}

	@Test
	public void testGetIntScannerString()
	{
		Scanner keyboard = new Scanner(System.in);
		assertTrue(Validator.getInt(keyboard, "Enter int: ")==(int)Validator.getInt(keyboard, "Enter the same int: ") );
	}

	@Test
	public void testGetBoolean()
	{
		Scanner keyboard = new Scanner(System.in);
		assertTrue(Validator.getBoolean(keyboard, "Enter y/n: ")==(boolean)Validator.getBoolean(keyboard, "Enter the same: "));
	}
	
	@Test
	public void testGetDouble()
	{
		Scanner keyboard = new Scanner(System.in);
		assertTrue((Validator.getDouble(keyboard, "enter double", 0, 10) == (double)Validator.getDouble(keyboard, "enter the same", 0, 10)));
	}

}
