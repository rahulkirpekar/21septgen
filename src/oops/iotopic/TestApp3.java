package iotopic;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		boolean flag = true;
		try 
		{
			FileWriter fw = new FileWriter("test3.txt",true);
			for (int i = 1; i <=10; i++)
			{
				flag = true;
				int no = i;
				for(int j=2; j < no; j++) 
				{
					if(no%j==0) 
					{
						flag=false;
						break;
					}
				}
				if(flag) 
				{
					System.out.println(no);
					fw.write(no);
				}
			}
			fw.close();
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
