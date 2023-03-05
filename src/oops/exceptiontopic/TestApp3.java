package oops.exceptiontopic;

import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int no1,no2,ans=0;
		
		System.out.println("Enter No1 : ");
		no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		no2 = sc.nextInt();
		
		try 
		{
			ans = no1/no2;
		} catch (Exception e) 
		{
			e.printStackTrace();
		}finally 
		{
			System.out.println("Hi, I am Finally Block");
		}
		
		System.out.println("Addition : " + ans);
		
	}
}
