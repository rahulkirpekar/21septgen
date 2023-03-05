package oops.innerclasstopic;

public class A 
{
	private int no = 100;
	// Member InnerClass
	class B
	{
		void msg() 
		{
			System.out.println("B -- no  : " + no);
		}
	}
	public static void main(String[] args) 
	{
		A outerObj = new A();
		
		A.B innerObj = 	outerObj. new B();
		
		innerObj.msg();
		
	}
}
