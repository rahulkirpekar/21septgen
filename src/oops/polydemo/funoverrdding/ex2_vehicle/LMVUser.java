package oops.polydemo.funoverrdding.ex2_vehicle;

public class LMVUser extends Vehicle
{
	int speed=80;
	@Override
	void getSpec() 
	{
		System.out.println("LMVUser---specification");
	}
}
