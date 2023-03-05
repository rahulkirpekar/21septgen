package oops.constdemo;

public class C implements B , A
{
	public static void main(String[] args) 
	{
		C obj = new C();
		
		obj.test();
	}
	@Override
	public void test() {
		// TODO Auto-generated method stub
		A.super.test();
	}
}
