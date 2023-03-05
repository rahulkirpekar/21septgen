package oops.threadtopic.tasks;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Table resource = new Table();
		
		MyThread1 th1 = new MyThread1(resource);
		MyThread1 th2 = new MyThread1(resource);
		MyThread1 th3 = new MyThread1(resource);
		MyThread1 th4 = new MyThread1(resource);
		MyThread1 th5 = new MyThread1(resource);
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
	}
}
