package oops.executionflow;

// Class Execution Flow
public class TestApp1 
{
	// Static Block
	static 
	{
		System.out.println("TestApp1---1) Static Block----3");
	}
	// Static Block
	static 
	{
		System.out.println("TestApp1---1) Static Block----1");
	}
	// Static Block
	static 
	{
		System.out.println("TestApp1---1) Static Block----2");
	}
	// Instance Block---2
	{
		System.out.println("TestApp1---4) Instance Block---2");
	}
	// Instance Block---1
	{
		System.out.println("TestApp1---4) Instance Block---1");
	}
	// Instance Block---4
	{
		System.out.println("TestApp1---4) Instance Block---4");
	}
	// Default Constructor
	public TestApp1()
	{
		System.out.println("TestApp1---5) Default Constructor");
	}
	// Instance Block---3
	{
		System.out.println("TestApp1---4) Instance Block---3");
	}
	// Para Constructor
	public TestApp1(int no1)
	{
		this();
		System.out.println("TestApp1---5) Para Constructor -- " + no1);
	}
	// static method
	public static void staticTest1()
	{
		System.out.println("TestApp1---3) static method -- ");
	}
	// NonStatic method
	public void nonStaticTest1()
	{
		System.out.println("TestApp1---6) NonStatic method -- ");
	}
	public static void main(String[] args) 
	{
		System.out.println("START :: 2) Main Method");
		TestApp1.staticTest1();
		
		TestApp1 obj1 = new TestApp1(10);
		TestApp1 obj2 = new TestApp1(10);
		obj1.nonStaticTest1();
		obj2.nonStaticTest1();

		System.out.println("EXIT :: 2) Main Method");
	}
}