package oops.threadtopic.bythread;

//1) By extending Thread class
public class MyThread1 extends Thread
{
	// job defined --- thread1
	@Override
	public void run() 
	{
		System.out.println(Thread.currentThread().getId() + " " +Thread.currentThread().getName());
//		System.out.println("Hi I am Thread - My Name is :: " + Thread.currentThread().getName());
	}
	public static void main(String[] args) 
	{
		MyThread1 thread1 = new MyThread1();
		MyThread1 thread2 = new MyThread1();
		MyThread1 thread3 = new MyThread1();
		MyThread1 thread4 = new MyThread1();
		MyThread1 thread5 = new MyThread1();
		
		thread1.setName("C_Lang");
		thread2.setName("C++_Lang");
		thread3.setName("JAVA_Lang");
		thread4.setName("Python_Lang");
		thread5.setName("SCALA_Lang");
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
	}
}

//run()
//main()
//--------
//main