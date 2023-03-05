package oops.accessmodifiers;

public class Student 
{
	private int rno;
	private String name;
	private int std;

	protected int marks;

	public int grade;
	void test() 
	{
		
	}
	public static void main(String[] args) 
	{
		Student s = new Student();
		
		s.rno=1;
		s.test();
		s.marks=20;
		
		
	}
}
