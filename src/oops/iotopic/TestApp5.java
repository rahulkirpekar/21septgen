package iotopic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileReader fr = new FileReader("C:\\Users\\Royal\\eclipse-workspace\\21Gen(25)_Sept\\test3.txt");
			int temp;
			while(	(temp = fr.read()) != -1	) 
			{
				System.out.println(temp);
			}
		
			fr.close();
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
