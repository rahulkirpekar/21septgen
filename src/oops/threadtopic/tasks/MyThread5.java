package oops.threadtopic.tasks;

public class MyThread5 extends Thread
{
	Table t = null;
	
	public MyThread5(Table t) 
	{
		this.t=t;
	}
	@Override
	public void run() 
	{
		t.printTable(25);
	}
}


