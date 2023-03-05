package oops.staticdemo;
public class TestApp1 
{
	int no1;
	static int no2;
	public TestApp1() 
	{
		no1++;
		no2++;
	}
	public static void main(String[] args) 
	{
		TestApp1 app1 = new TestApp1();
		TestApp1 app2 = new TestApp1();
		TestApp1 app3 = new TestApp1();
		TestApp1 app4 = new TestApp1();
		TestApp1 app5 = new TestApp1();
		System.out.println("app1.no1 - " + app1.no1);//1
		System.out.println("app2.no1 - " + app2.no1);//1
		System.out.println("app3.no1 - " + app3.no1);//1
		System.out.println("app4.no1 - " + app4.no1);//1
		System.out.println("app5.no1 - " + app5.no1);//1
		System.out.println("app1.no2 - " + app1.no2);//5
	}
}