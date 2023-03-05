package oops.threadtopic.tasks;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Table resource = new Table();
		MyThread1 t1 = new MyThread1(resource);
		MyThread2 t2 = new MyThread2(resource);
		MyThread3 t3 = new MyThread3(resource);
		MyThread4 t4 = new MyThread4(resource);
		MyThread5 t5 = new MyThread5(resource);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}   
}       
