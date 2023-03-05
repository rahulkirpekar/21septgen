package oops.exceptiontopic;

import java.io.IOException;
import java.util.Scanner;

public class TestApp4 
{
	public static void isValidForVote(int age) throws InvalidAgeException
	{
		if (age < 18) 
		{
			// raise exception
			throw new InvalidAgeException("\n\"Invalid Age Exception,\n\t Please enter Greater than 18 age\"");
		} else 
		{
			System.out.println("welcome for Vote");
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Enter Age for Voting  : ");
		int age = new Scanner(System.in).nextInt();
		
		try 
		{
			isValidForVote(age);
		} catch (InvalidAgeException e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("After Method call");
	}
}
