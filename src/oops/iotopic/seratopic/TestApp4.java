package oops.iotopic.seratopic;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class TestApp4 
{
	public static void main(String[] args) 
	{
		try (
				FileInputStream fin = new FileInputStream("listofstudents.txt");
				ObjectInputStream oin = new ObjectInputStream(fin);
			)
		{
			Student s[] = (Student[])oin.readObject();
			for (int i = 0; i < s.length; i++) 
			{
				s[i].disp();
			}
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
