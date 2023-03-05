package oops.exceptiontopic;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int no1,no2,ans=0;
		System.out.println("Enter No1 : ");
		no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		no2 = sc.nextInt();
		try 
		{
			try 
			{
				ans = no1/no2;
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			String name = null;
			try 
			{
				System.out.println("name.length() - " + name.length());
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			int a[] = new int[5];
			try 
			{
				a[5] = 100;
				System.out.println("a[5] - " + a[5]);
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			String value = "sadf324dcxf";
			try 
			{
				int no = Integer.parseInt(value);
				System.out.println("no - " + no);
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}catch(Exception e) 
		{
			e.printStackTrace();
			System.out.println("Exception Handled By Catch Block");
		}
		System.out.println("Addition : " + ans);
	}
}
