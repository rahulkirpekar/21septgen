package iotopic;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		int no1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No1 : ");
		no1 = sc.nextInt();
		
		
		if (no1 > 0) 
		{
			System.out.println("No1 is Positive : " +no1);
		} else 
		{
			System.err.println("Negative Value of Nos");
		}
		
		
	}
}
