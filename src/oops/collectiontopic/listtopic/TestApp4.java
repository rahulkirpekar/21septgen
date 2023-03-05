package oops.collectiontopic.listtopic;

import java.util.LinkedList;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		LinkedList<String> mainList = new LinkedList<String>();
		mainList.add("India");
		mainList.add("US");
		mainList.add("UK");
		mainList.add("Japan");
		mainList.add("China");
		mainList.add("Pakistan");
		mainList.add("Bangladesh");
		LinkedList<String> subList = new LinkedList<String>();
		subList.add("Pakistan");
		subList.add("Bangladesh");
		System.out.println("mainList : " + mainList);
		System.out.println("subList : " + subList);
		
//		mainList.retainAll(subList);
//		mainList.addAll(subList);
//		mainList.addAll(2,subList);

//		mainList.clear();
//		boolean flag = mainList.containsAll(subList);
		
//		System.out.println("mainList : " + mainList + " " +flag );
//		System.out.println("subList : " + subList);
		
	}
}
