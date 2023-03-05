package oops.collectiontopic.listtopic;
import java.util.ArrayList;
import java.util.Iterator;
public class TestApp2 
{
	public static void main(String[] args) 
	{
		Student s1 = new  Student(1, "rahul", 12);//0
		Student s2 = new  Student(2, "brijesh", 6);//1
		Student s3 = new  Student(3, "sagar", 12);//2
		Student s4 = new  Student(4, "ankur", 11);//3
		Student s5 = new  Student(5, "krunal", 10);//4
		ArrayList<Student>list = new ArrayList<Student>();	
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		Iterator<Student> itr =	list.iterator();
		while(itr.hasNext()) 
		{
			Student s = itr.next();
			s.disp();
		}
		Student s = new Student(3, "Viraj", 12);
		list.add(3, s);
		System.out.println("After insert at index : ");
		itr =	list.iterator();
		while(itr.hasNext()) 
		{
			s = itr.next();
			s.disp();
		}
		
		
//		list.remove(3);
//		System.out.println("After removing records : ");
//		itr =	list.iterator();
//		while(itr.hasNext()) 
//		{
//			Student s = itr.next();
//			s.disp();
//		}
		
		
		
//		Student s = new Student(3, "Viraj", 12);
		// Update
//		list.set(2, s);
//		System.out.println("After Updating records : ");
		
//		itr =	list.iterator();
//		while(itr.hasNext()) 
//		{
//			s = itr.next();
//			s.disp();
//		}
		
		
	}
}
