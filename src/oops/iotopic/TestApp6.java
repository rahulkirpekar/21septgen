package iotopic;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestApp6 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileOutputStream fout = new FileOutputStream("", true);
		
			for(int i=0;i<=10;i++) 
			{
				fout.write(i);
			}
			fout.close();
			
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		
		
	}

}
