package oops.collectiontopic.queuetopic;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		PriorityQueue<String> queueObj = new PriorityQueue<String>();
		queueObj.add("India");
		queueObj.add("US");
		queueObj.add("UK");
		queueObj.add("Japan");
		queueObj.add("China");
		queueObj.add("Pakistan");
		queueObj.add("Bangladesh");
		
		Iterator<String>itr = queueObj.iterator();
		while(itr.hasNext()) 
		{
			String name = itr.next();    
			System.out.println(name);    
		}
	}
}
