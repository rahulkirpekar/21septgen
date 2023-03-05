package oops.finaldemo;

import java.util.Scanner;
public class TestApp1 
{
	final int no1;
	public TestApp1() 
	{
		no1=10;
	}
	public TestApp1(int no1) 
	{
		this.no1=no1;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter no1 : ");
		int no1 =  new Scanner(System.in).nextInt();
		TestApp1 obj = new TestApp1(no1);
		System.out.println("No1 : " + obj.no1);
//		System.out.println("Updated No1 : " + obj.no1);
	}
}
