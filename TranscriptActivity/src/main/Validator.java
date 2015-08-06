package main;


import java.util.Scanner;



public class Validator
{
	public static String getString(Scanner sc, String prompt)
	{
		System.out.print(prompt);
		String s = sc.nextLine();
		return s;
	}

	
	public static int getInt(Scanner sc, String prompt)
	{
		
		int number = 0;
		boolean isValid = false;
		
		while (isValid == false)
		{
			System.out.print(prompt);
			if(sc.hasNextInt())
			{
				number = sc.nextInt();
				isValid = true;
			}
			else
			{
				System.out.println("Error! Invalid Integer.Please try again");
			}
			
		}
		return number;
	}
	
	public static int getInt(Scanner sc, String prompt, int min, int max)
	{
		int number = 0;
		boolean isValid = false;
		
		while(isValid == false)
		{
			System.out.print(prompt);
			
			if(sc.hasNextInt())
			{
				int temp = sc.nextInt();
				if(temp>=min && temp<=max)
				{
					number = temp;
					isValid = true;
				}
				else
				{
					System.out.println("Error! Invalid Integer.Please try again");
					getInt(sc,prompt,min,max);
				}
			}

		}
		return number;
	}
	
	public static double getDouble(Scanner sc, String prompt, double min, double max)
	{
		double number = 0;
		boolean isValid = false;
		
		while(isValid == false)
		{
			System.out.print(prompt);
			if(sc.hasNextDouble())
			{
				double temp = sc.nextDouble();
				if(temp >= min && temp <= max)
				{
					number = temp;
					isValid = true;
				}
				else
				{
					System.out.println("Error! Invalid number.Please try again");
					sc.nextDouble();
				}
				
			}
			else
			{
				System.out.println("Error! Invalid number.Please try again");
				
				sc.nextLine();
			}
			sc.nextLine();
		}
		return number;
	}
	
	public static boolean getBoolean(Scanner sc, String prompt)
	{
		boolean isValid = false;
		boolean decision = false;
		while(isValid == false)
		{
			System.out.print(prompt);
			String temp = sc.next();
			if (temp.equalsIgnoreCase("y"))
			{
				isValid = true;
				decision = true;
			}
			else if (temp.equalsIgnoreCase("n"))
			{	
				isValid = true;
				decision = false;
			}
			sc.nextLine();
		}
		return decision;
	}
}

