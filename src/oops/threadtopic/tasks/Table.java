package oops.threadtopic.tasks;

// resource---Table
public class Table 
{
	public synchronized void printTable(int no) 
	{
		for (int i = 0; i <=10; i++) 
		{
			try 
			{
				Thread.sleep(500);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println(	Thread.currentThread().getName() + "---->" +	no + " * " + i + " = " +(no*i));
		}
	}
}
