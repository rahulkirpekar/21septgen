package oops.iotopic.seratopic;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
public class TestApp2 
{
	public static void main(String[] args) 
	{
		try (
				FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\21Gen(25)_Sept\\studentrcd.txt");
				ObjectInputStream oin = new ObjectInputStream(fin);
			)
		{
			Object obj = oin.readObject();
			Student s = (Student)obj;
			System.out.println(s+ " - "  + s.getRno() + " " +s.getName() + " " +s.getStd());
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}