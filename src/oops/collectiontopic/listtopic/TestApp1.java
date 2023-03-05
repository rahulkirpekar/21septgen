package oops.collectiontopic.listtopic;
import java.util.ArrayList;
import java.util.Iterator;
//List
//|
//AbstractList
//|
//ArrayList
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s = new  Student(1, "rahul", 12);
		ArrayList list = new ArrayList();	
		list.add(30);  //0 <===itr Intger.valuesOf(30); --  AutoBoxing[primitive to Object] 
		list.add(10.324);//1
		list.add(20.324f);//2
		list.add(true);//3
		list.add(234L);//4
		list.add('R');//5
		list.add(s);//6
		
		System.out.println("list.size() - " + list.size());
		System.out.println(list.get(4));
//		for (int i = 0; i < list.size(); i++) 
//		{
//			Object obj = list.get(i);
//			if(obj instanceof Student) 
//			{
//				s = (Student)obj;
//				s.disp();
//			}else 
//			{
//				System.out.println(obj);
//			}
//		}
//		for(Object obj : list)
//		{
//				if(obj instanceof Student) 
//				{
//					s = (Student)obj;
//					s.disp();
//				}else 
//				{
//					System.out.println(obj);
//				}
//		}
		// traditional way for collection 
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) 
		{
			Object obj = itr.next();    
			if(obj instanceof Student)      
			{                               
				s = (Student)obj;           
				s.disp();                   
			}else                           
			{                               
				System.out.println(obj);    
			}                               
		}
	}
}
