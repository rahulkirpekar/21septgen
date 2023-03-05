package oops.polydemo.secexam;
import java.util.Scanner;
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter User Bank Choice for HomeLoan : ");
		System.out.println("1) For AxisBank HomeLoan");
		System.out.println("2) For SbiBank HomeLoan");
		System.out.println("3) For BanoOfBaroda HomeLoan");
		int choiceForBank = sc.nextInt();
		RbiBank homeLoanCustomer = null;
		switch (choiceForBank) 
		{
			case 1:
				homeLoanCustomer = new AxisBank();
				System.out.println("Hey, you got AxisBank HomeLoan --" + homeLoanCustomer.getHomeLoanIntrst());
				break;
			case 2:
				homeLoanCustomer = new SbiBank();
				System.out.println("Hey, you got SbiBank HomeLoan --" + homeLoanCustomer.getHomeLoanIntrst());
				break;
			case 3:
				homeLoanCustomer = new BankOfBaroda();
				System.out.println("Hey, you got BankOfBaroda HomeLoan --" + homeLoanCustomer.getHomeLoanIntrst());
				break;
	
			default:System.out.println("Invalid Bank,\n\tPlease enter between 1 to 4 choice ");
				break;
		}
	}
}
