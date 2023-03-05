package oops.threadtopic.byrunnable;

public class MyThread2 extends Thread
{
	@Override
	public void run() 
	{
		for (int i = 1; i <=10; i++) 
		{
			try 
			{
				Thread.sleep(500);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println(i + " - " +Thread.currentThread().getId() + " - " + Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) 
	{
		MyThread2 t1 = new MyThread2();
		MyThread2 t2 = new MyThread2();
		MyThread2 t3 = new MyThread2();
		MyThread2 t4 = new MyThread2();
		MyThread2 t5 = new MyThread2();

//		t1.start();// IllegalThreadStatException
		
//		t1.setPriority(Thread.MAX_PRIORITY);
//		t2.setPriority(Thread.NORM_PRIORITY);
//		t3.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();

		try 
		{
			t1.join(2000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
