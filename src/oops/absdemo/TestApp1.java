package oops.absdemo;
import java.util.Scanner;
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter below bank choice : ");
		System.out.println("1) for AxisBank User");
		System.out.println("2) for BankofBarodda Bank User");
		System.out.println("3) for SbiBank User");
		int choice = sc.nextInt();
		RbiBank bank = null;
		switch(choice) 
		{
			case 1: bank = new AxisBank();
					bank.test4()
					System.out.println("Welcome to AxisBank, your HomeLoan Percentage is - " + bank.getHomeLoanPer());
					break;
			case 2: bank = new BankofBaroda();
					System.out.println("Welcome to BankofBaroda, your HomeLoan Percentage is - " + bank.getHomeLoanPer());
					break;
			case 3: bank = new SbiBank();
					System.out.println("Welcome to SbiBank, your HomeLoan Percentage is - " + bank.getHomeLoanPer());
					break;
			default:
					System.out.println("Invalid User, Please enter between 1 to 3 Banks");
		}
	} 
}