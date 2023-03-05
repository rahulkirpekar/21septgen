package oops.threadtopic.tasks;

public class TestApp3 //extends Thread
{
//	@Override
//	public void run() 
//	{
//		System.out.println("HI I am Thread");
//	}
	public static void main(String[] args) 
	{
//		TestApp3 t1 = new TestApp3();
//		t1.start();
		Thread t1 = new Thread() 
		{
			public void run() 
			{
				System.out.println(Thread.currentThread().getName() + " Hi I am Thread");
			};
		};
		Thread t2 = new Thread() 
		{
			public void run() 
			{
				System.out.println(Thread.currentThread().getName() + " Hi I am Thread");
			};
		};
		t1.start();
		t2.start();
	}
}
