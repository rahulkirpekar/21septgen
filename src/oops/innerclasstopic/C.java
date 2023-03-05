package oops.innerclasstopic;

public class C 
{
	static int no=200;
	// Nested class
	static class L
	{
		void msg() 
		{
			System.out.println("L -- msg ---" + no);
		} 
	} 
	public static void main(String[] args) 
	{
		C.L lobj = new C.L();
		
		
		lobj.msg();
		
	}
}
