package oops.constdemo;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		String name = "Rahul Kirpekar";
		
		System.out.println("START :: main method");

		Student s1 = new Student(2,"Krunal ",12);
		Student s2 = new Student(s1);

		s1.disp();
		s2.disp();
		
		System.out.println("EXIT :: main method");
	} 
}
