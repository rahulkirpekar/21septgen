package oops.constdemo;

public class Student 
{
	int rno;
	String name;
	int std;

	public Student() 
	{
		System.out.println("START :: Default Constructor");
		disp();
		rno=1;
		name="rahul kirpekar";
		std=12;
		System.out.println("EXIT :: Default Constructor");
	}
	public Student(int rno,String name,int std) 
	{
		System.out.println("START :: PARA Constructor");
		this.rno=rno;
		this.name=name;
		this.std=std;
		System.out.println("EXIT :: PARA Constructor");
	}
	public Student(Student s) 
	{
		System.out.println("START :: PARA-COPY Constructor");
		this.rno = s.rno;
		this.name= s.name;
		this.std = s.std;
		System.out.println("EXIT :: PARA-COPY Constructor");
	}
	void disp() 
	{
		System.out.println(rno + " "+name + " " + std + " " + this);
	}
	
}
