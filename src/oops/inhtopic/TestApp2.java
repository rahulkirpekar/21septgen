package oops.inhtopic;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		// Tech Employees
		TechEmp techEmp = new TechEmp();
		techEmp.scan();
		techEmp.disp();
		
		// NonTech Employees
		NonTechEmp nonTechEmp = new NonTechEmp();
		nonTechEmp.scan();
		nonTechEmp.disp();
	}
}
