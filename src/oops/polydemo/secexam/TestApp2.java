package oops.polydemo.secexam;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		// Upcasting
//		RbiBank rbiBank = new AxisBank();
//		System.out.println(rbiBank.getHomeLoanIntrst());
		// DownCasting
//		((AxisBank)rbiBank).test1();
	
		
//		RbiBank rbiBank = new AxisBank();
//		RbiBank rbiBank = new BankOfBaroda();
		
//		rbiBank.getLoanFromUserBank(rbiBank);
		
		RbiBank rbiBank = new AxisBank();

		System.out.println(rbiBank instanceof RbiBank );
	}
}
