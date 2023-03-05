package oops.threadtopic.tasks;

public class MyThread4 extends Thread
{
	Table t = null;
	
	public MyThread4(Table t) 
	{
		this.t=t;
	}
	@Override
	public void run() 
	{
		t.printTable(20);
	}
}


