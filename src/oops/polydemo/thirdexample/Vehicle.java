package oops.polydemo.thirdexample;

public class Vehicle 
{
	public void getSpec() 
	{
		System.out.println("Vehicle - getSpec()");
	}	
	public void getSpecByUserVehicle(Vehicle vehicle) 
	{
		if (vehicle instanceof TWuser) 
		{
			TWuser twUser = (TWuser)vehicle;
			vehicle.getSpec();
//			((TWuser)vehicle).getTWuserTest();
			
//			vehicle.getLMVUserTest();
			
		} else if(vehicle instanceof LMVUser) 
		{
			LMVUser lmvUser = (LMVUser)vehicle;
			lmvUser.getSpec();
		}else if(vehicle instanceof HMVUser) 
		{
			HMVUser hmvUser = (HMVUser)vehicle;
			hmvUser.getSpec();
		}
	}
}
