package oops.polydemo.funoverloadtopic;

public class OverloadingCalculation1 
{
	void sum(int a, long b) 
	{
		System.out.println("sum(int a, long b)  " + (a + b));
	}
	void sum(int a, int b, int c) 
	{
		System.out.println("(sum(int a, int b, int c) )"+ (a + b + c));
	}
	public static void main(String args[]) 
	{
		OverloadingCalculation1 obj = new OverloadingCalculation1();

		obj.sum(20, 20);// now second int literal will be promoted to long
		obj.sum(20, 20, 20);
	}
}
