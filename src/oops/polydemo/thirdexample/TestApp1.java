package oops.polydemo.thirdexample;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter your vechile specification Choice : ");
		System.out.println("1) For Two Wheelar ");
		System.out.println("2) For Light Motor Vehicle ");
		System.out.println("3) For Heavy Motor Vehicle  ");
		int choice = sc.nextInt();
		
		Vehicle vehicle = null;
		switch (choice) 
		{
			case 1: // upcasting
					vehicle = new TWuser();
					vehicle.getSpecByUserVehicle(vehicle);
					break;
					
			case 2: vehicle = new LMVUser();
					vehicle.getSpecByUserVehicle(vehicle);
					break;
					
			case 3:	vehicle = new HMVUser();
					vehicle.getSpecByUserVehicle(vehicle);
					break;
	
			default: System.out.println("Invalid Choice,\n\tPlease enter between 1 to 3 choice.");
					 break;
		}
	}
}
