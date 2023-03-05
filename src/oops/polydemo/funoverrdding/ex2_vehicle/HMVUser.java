package oops.polydemo.funoverrdding.ex2_vehicle;

public class HMVUser  extends Vehicle
{
	int speed=100;
	@Override
	public void getSpec() 
	{
		System.out.println("HMVUser---specification");
	}
}
