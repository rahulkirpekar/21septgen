package oops.stringtopic.mutableway;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		String name = "royal";
		
		StringBuffer sb1 = new StringBuffer(name);

		System.out.println(sb1 + " - " +sb1.hashCode());
		sb1.append(" Tehcnosoft Pvt Ltd.");
		System.out.println(sb1 + " - " +sb1.hashCode());
		
		name = sb1.toString();
		
		System.out.println(name);
	}
}
