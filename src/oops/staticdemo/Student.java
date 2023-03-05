package oops.staticdemo;

import java.util.Scanner;

public class Student 
{
	int rno;
	String name;
	int std;
	static String schoolName;// staticway---ClassName.staticPropertie
	
	public static void setSchoolName(String schoolName) 
	{
//		rno=1;
		Student.schoolName = schoolName;
	}	
	void scan() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
	}
	void disp() 
	{
		System.out.println(rno + " "+name + " " + std + " " +this+ " - "+ schoolName + " " +schoolName.hashCode());
	}
	public static void main(String[] args) 
	{
		Student.schoolName="Meghdoot";
//		
//		Student s[] = new Student[5];
//		
//		for (int i = 0; i < s.length; i++) 
//		{
//			s[i] = new Student();
//			s[i].scan();
//		}
//		for (int i = 0; i < s.length; i++) 
//		{
//			s[i].disp();
//		}
	}
}
