package oops;

import java.util.Scanner;

public class Employee 
{
	// Object ---> class Properties =  1) Data Members + 2 ) Member Function
	int id;
	String name;
	double salary;
	String dsgn;
	String orgname;
	
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Salary : ");
		salary = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter Dsgn : ");
		dsgn = sc.nextLine();
		System.out.println("Enter OrgName : ");
		orgname = sc.nextLine();
	}
	public void disp() 
	{
		System.out.println(id + " "+name + " "+salary + " " + dsgn+ " " +orgname);
	}
}
