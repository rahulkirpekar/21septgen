package oops.encapsdemo;
import java.util.Scanner;
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int rno,std;
		String name;
		Student s[] = new Student[5];
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println("Enter Rno : ");
			rno = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Name : ");
			name = sc.nextLine();
			System.out.println("Enter Std : ");
			std = sc.nextInt();
			s[i]= new Student();
			s[i].setRno(rno);
			s[i].setName(name);
			s[i].setStd(std);
		}
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println(s[i].getRno() + " " + s[i].getName() + " "+s[i].getStd());
		}		
	}
}
