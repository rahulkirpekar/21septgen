package oops.inhtopic.aggregationtopic;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Address address = new Address("Ahm", "Guj", "IND", "123434", "123456754");
		
		Employee e = new Employee(1, "rahul", "SE", address);
		
		e.disp();
		
	}
}
