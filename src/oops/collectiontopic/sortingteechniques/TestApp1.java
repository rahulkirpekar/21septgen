package oops.collectiontopic.sortingteechniques;

import java.util.Collections;
import java.util.LinkedList;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		LinkedList<String> list = new LinkedList<String>();
		list.add("rahul");
		list.add("ankur");
		list.add("rakesh");
		list.add("sagar");
		list.add("krunal");
		list.add("maharshi");
		list.add("rohit");
		
		System.out.println("list---> " + list);
		Collections.sort(list);
		System.out.println("After Calling sort method : ");
		System.out.println("list---> " + list);
	}
}
