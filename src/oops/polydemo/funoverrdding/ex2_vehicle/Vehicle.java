package oops.polydemo.funoverrdding.ex2_vehicle;
/**
 * 
 * @author Rahul Kirpekar
 * @implNote - This Vehicle class is Example for Runtime Polymorphism
 * @since 2022
 * 
 * 
 * */
public class Vehicle 
{
	int speed=0;
	
	/**
	 * @author Rahul Kirpekar
	 * @implSpec This getSpec method is used in Runtime Polymorphism
	 */
	void getSpec() 
	{
		A  obj = new A();
		System.out.println("General Vehicle Specfication");
	}
}
