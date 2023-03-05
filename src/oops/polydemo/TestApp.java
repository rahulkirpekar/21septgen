package oops.polydemo;

public class TestApp 
{
	public static void main(String[] args) 
	{
		// CompileTime Polymorphism
//		Vehicle vehicle = new Vehicle();

		// polymorphism Object
		Vehicle vehicle = new TWUser();
		vehicle.getSpecification();
		
		vehicle = new LmvUser();
		vehicle.getSpecification();

		vehicle = new HmvUser();
		vehicle.getSpecification();

	}
}
