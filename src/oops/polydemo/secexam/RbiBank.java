package oops.polydemo.secexam;

public class RbiBank 
{
	public int getHomeLoanIntrst() 
	{
		return 0;
	}
	public void getLoanFromUserBank(RbiBank rbiBank) 
	{
		if (rbiBank  instanceof  BankOfBaroda) 
		{
			BankOfBaroda bob = (BankOfBaroda)rbiBank;
			System.out.println("BankOfBaroda - " + bob.getHomeLoanIntrst());
		} else if( rbiBank instanceof AxisBank)
		{
			AxisBank axsiBank = (AxisBank)rbiBank;
			System.out.println("AxisBank - " + axsiBank.getHomeLoanIntrst());

		}else if(rbiBank instanceof SbiBank)
		{
			SbiBank sbiBank = (SbiBank)rbiBank;
			System.out.println("SbiBank - " + sbiBank.getHomeLoanIntrst());
		}
	}
}
