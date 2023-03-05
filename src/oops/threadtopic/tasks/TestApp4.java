package oops.threadtopic.tasks;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		Runnable r1 = new Runnable() 
		{
			@Override
			public void run() 
			{
				System.out.println(" Hi I ama Thread---" + Thread.currentThread().getName());
			}
		}; 
		Runnable r2 = new Runnable() 
		{
			@Override
			public void run() 
			{
				System.out.println(" Hi I ama Thread---"+ Thread.currentThread().getName());
			}
		}; 
		
		Thread t1  = new Thread(r1);
		Thread t2  = new Thread(r2);
		
		t1.start();
		t2.start();
	}
}
