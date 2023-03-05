package oops.lamdatopic;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Animal animal =	(no1,no2) -> (no1+no2);

		System.out.println(animal.addFun(10,20));
	}
}
