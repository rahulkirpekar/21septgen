package oops.inhtopic.aggregationtopic;

public class Employee 
{
	int id;
	String name;
	String dsgn;
	Address address;
	
	public Employee(int id,String name,String dsgn,Address address) 
	{
		this.id=id;
		this.name=name;
		this.dsgn=dsgn;
		this.address=address;
	}
	public void disp() 
	{
		System.out.print(id + " "+ name + " " + dsgn + " ");
		System.out.println(address.city + " "+ address.state + " "+ address.cntry + " "+ address.pin + " "+ address.contact);
	}
}
