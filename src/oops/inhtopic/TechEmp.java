package oops.inhtopic;

import java.util.Scanner;

public class TechEmp  extends Employee
{
	int bonus;
	public void scan() 
	{
		Scanner sc = new Scanner(System.in);
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
		System.out.println("Enter TechEmployee Bonus : ");
		bonus = sc.nextInt();
	}
	public void disp() 
	{
		System.out.println(id + " " + name + " "+ salary + " "+ dsgn + " " + orgName + " "+ bonus);
	}
}
