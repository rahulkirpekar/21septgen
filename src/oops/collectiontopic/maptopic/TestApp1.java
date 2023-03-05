package oops.collectiontopic.maptopic;

import java.util.TreeMap;
import java.util.Map;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer, String> mapObj = new TreeMap<Integer, String>();
		mapObj.put(1, "rakesh");// entry---[key,value]
		mapObj.put(4, "sagar");
		mapObj.put(2, "rahul");
		mapObj.put(3, "krunal");
		mapObj.put(5, "ankur");

		System.out.println(mapObj.keySet());
		System.out.println(mapObj.values());
		
		for( Map.Entry<Integer, String>  e	: mapObj.entrySet()) 
		{
			System.out.println(e.getKey() + " " +e.getValue());
		}
	}
}
