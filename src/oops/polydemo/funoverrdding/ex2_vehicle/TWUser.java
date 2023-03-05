package oops.polydemo.funoverrdding.ex2_vehicle;

public class TWUser extends Vehicle
{
	int speed=50;
	protected void getSpec() 
	{
		System.out.println("TWUser---specification");
	}
	void test1() 
	{
		System.out.println("TWUser---test1()");
	}
}
