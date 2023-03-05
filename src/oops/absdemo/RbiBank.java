package oops.absdemo;
public abstract interface RbiBank 
{	
	// 1) Constant Variables---"public static final"
	public static final int VALUE1 = 10;//public static final
	public  final int VALUE2 = 10;//static
	static final int VALUE3 = 10;//public 
	public static int VALUE4 = 10;//final 
	int VALUE5 = 10;//public static final 
	
	// 2) abstrct methods--"public abstract"
	int getHomeLoanPer();//public abstract
	public int test1();//abstract
	abstract int test2();//public 
	public abstract int test3();
	
	// 3) NonAbstract Methods:-
//	---------------------------
//		   1) Default Method---Java_8_Version
		default void test4() 
		{
			test6();
			System.out.println("Default test4()");
		}
//		   2) static Method---Java_8_Version
		static void test5() 
		{
			System.out.println("static test5()");
		}
//		   3) private Method---Java_9_Version
		private void test6() 
		{
			System.out.println("private test6()");
		}
}