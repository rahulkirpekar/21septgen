package oops.polydemo.thirdexample;

public class HMVUser extends Vehicle
{
	@Override
	public void getSpec() 
	{
		System.out.println("HMVUser--getspecification() - " + this);
	}
}
