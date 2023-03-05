package iotopic;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestFileWriter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.nextLine();

		try 
		{
			FileWriter fw = new FileWriter("testfilewriter.txt");
		
			fw.write(name);
			
			fw.close();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}