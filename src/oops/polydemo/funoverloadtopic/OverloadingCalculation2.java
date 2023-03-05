package oops.polydemo.funoverloadtopic;

public class OverloadingCalculation2 
{
	void sum(int a, int b) 
	{
		System.out.println("int arg method invoked");
	}
	void sum(long a, long b) 
	{
		System.out.println("long arg method invoked");
	}
	public static void main(String args[]) 
	{
		System.out.println("public static void main(String args[])");
		main("rahul");
	}
	public static void main(int args) 
	{
	}
	public static void main(String obj) 
	{
	}
}// One type is not de-promoted implicitly for example double cannot be depromoted to any type implicitly.