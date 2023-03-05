package iotopic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestApp7 
{
	public static void main(String[] args) 
	{
		
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\21Gen(25)_Sept\\test5.txt");
			int temp;
			while(	(temp=fin.read())	!= -1	) 
			{
				System.out.print(temp);
			}
			fin.close();
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
