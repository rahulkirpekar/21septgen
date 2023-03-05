package iotopic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class TestAppFileInputStream 
{
	public static void main(String[] args) 
	{
		StringBuilder stmt = new StringBuilder();
		try 
		{
			// filename--test1.txt
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\21Gen(25)_Sept\\src\\iotopic\\TestAppFileOutputStream.java");
			
			int temp ;
			
			while(	(temp = fin.read())	!= -1) 
			{
				stmt.append((char)temp);
			}
			fin.close();
			
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Final String stmt : " + stmt);
	}
}