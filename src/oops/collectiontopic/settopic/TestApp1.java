package oops.collectiontopic.settopic;

import java.util.TreeSet;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		TreeSet<String> setObj = new TreeSet<String>();
		setObj.add("India");
		setObj.add("US");
		setObj.add("UK");
		setObj.add("Japan");
		setObj.add("China");
		setObj.add("Pakistan");
		setObj.add("Bangladesh");
		setObj.add("UK");
		setObj.add("Japan");
		setObj.add("China");
		setObj.add("Pakistan");
		
		System.out.println("mainList.size() - " + setObj.size());
		
		Iterator<String> itr = 	setObj.iterator();
		
		while(itr.hasNext()) 
		{
			String name = itr.next();
			System.out.println(name);
		}
	}

}
