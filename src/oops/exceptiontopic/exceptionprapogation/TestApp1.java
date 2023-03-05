package oops.exceptiontopic.exceptionprapogation;

import java.io.IOException;

public class TestApp1
{
	public void p() throws IOException
	{
		throw new IOException();
	}
	public void o()  throws IOException
	{
		p();
		System.out.println("o()---After p() called");
	}
	public void n() 
	{
		try 
		{
			o();
		} catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("Exception Handled : " + e);
		}
	}
	public void m() 
	{
		n();
		System.out.println("m()----After n() call ");
	}
	public static void main(String[] args) 
	{
		TestApp1 obj = new  TestApp1();
		
		obj.m();
	}
}