package oops.threadtopic.byrunnable;

public class MyThread1 implements Runnable
{
	@Override
	public void run() 
	{
		System.out.println("Hi I am Thread");
	}
	public static void main(String[] args) 
	{
		MyThread1 th1 = new MyThread1();

		Thread thread1 = new Thread(th1);
		
		thread1.start();
	}
}
