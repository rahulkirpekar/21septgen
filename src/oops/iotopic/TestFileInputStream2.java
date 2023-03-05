package iotopic;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileInputStream2 
{
	public static void main(String[] args) 
	{
		try(
				//"java---7 AutoClosable Resource"
				FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\21Gen(25)_Sept\\src\\iotopic\\TestAppFileOutputStream.java");
				FileOutputStream fout = new FileOutputStream("TestAppFileOutputStreamClone.java");
		   ) 
		{
			int temp;
			while( (temp = fin.read()) != -1 ) 
			{
				fout.write(temp);
			}
			System.out.println("Successfully write");
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}