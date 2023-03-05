package oops.collectiontopic.sortingteechniques.comparatortopic;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "rahul", 12);
		Student s2 = new Student(2, "nimesh", 10);
		Student s3 = new Student(3, "rohit", 9);
		Student s4 = new Student(4, "sagar", 8);
		Student s5 = new Student(5, "ankur", 7);
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		for (int i = 0; i < list.size(); i++) 
		{
			Student s = list.get(i);
			s.disp();
		}
		System.out.println("Sorting by Stdwise : ");
		Collections.sort(list, new StdWiseStudentComparator());
		for (int i = 0; i < list.size(); i++) 
		{
			Student s = list.get(i);
			s.disp();
		}
		System.out.println("Sorting by Namewise : ");
		Collections.sort(list, new NameWiseStudentComparator());
		for (int i = 0; i < list.size(); i++) 
		{
			Student s = list.get(i);
			s.disp();
		}
	}
}
