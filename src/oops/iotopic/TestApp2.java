package iotopic;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		// 1) Data scan from console / Data ready for writting process
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Name : ");
				String name = sc.nextLine();
				try 
				{
					// 2) File connection
					FileOutputStream fout = new FileOutputStream("test2.txt");
					
					// 3) convert ur Data into byte array
					byte b[] = name.getBytes();// Byte ---ASCII---A-65
					
					
					// 4) pass Byte array Data into write method
					fout.write(b);
					
					// 5) close file connection
					fout.close();
				} catch (FileNotFoundException e) 
				{
					e.printStackTrace();
				} catch (IOException e) 
				{
					e.printStackTrace();
				}finally 
				{
					System.out.println("Writting Process successfully Done");
				}
	}
}
