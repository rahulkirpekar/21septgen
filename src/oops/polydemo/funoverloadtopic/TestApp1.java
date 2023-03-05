package oops.polydemo.funoverloadtopic;

public class TestApp1 
{
	void addFun(int no1, int no2) 
	{
		System.out.println("no1 :"  + no1);
		System.out.println("no2 :"  + no2);

		System.out.println("addFun(int no1, int no2) -- " + (no1 + no2));
	}
	void addFun(float no1, float no2) 
	{
		System.out.println("addFun(float no1, float no2)");
	}
	void addFun(double  no1, double no2) 
	{
	}
	public static void main(String[] args) 
	{
		TestApp1 obj = new TestApp1();
		
//		obj.addFun('A','B');// char---integer values

	}
}
