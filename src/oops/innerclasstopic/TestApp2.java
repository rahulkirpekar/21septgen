package oops.innerclasstopic;

public class TestApp2 
{
	private int no=100;
	void get() 
	{
		// Local Innerclass
		class Test
		{
			void disp() 
			{
				System.out.println("Test--disp--- " + no);
			}
		}
		Test obj = new Test();
		obj.disp();
	}
	public static void main(String[] args) 
	{
		TestApp2 obj = new TestApp2();
		
		obj.get();
	}
}
