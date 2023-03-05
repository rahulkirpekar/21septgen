package oops.inhtopic;
public class Programmer extends Employee 
{
	double bonus;

	public void scan()
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter Employee Id : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Name : ");
		name = sc.nextLine();
		System.out.println("Enter Employee Salary : ");
		salary = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Dsgn : ");
		dsgn = sc.nextLine();
		System.out.println("Enter Employee OrgName : ");
		orgName = sc.nextLine();
		System.out.println("Enter Employee Bonus : ");
		bonus = sc.nextDouble();
	}
	public void disp()
	{
		System.out.println(id + " " + name + " " + salary + " "+dsgn + " " + orgName + " " +bonus);
	}

	public static void main(String args[])
	{
		Programmer eobj = new Programmer();
		
		eobj.salary=200;
		eobj.bonus=20000;
		
	}
}