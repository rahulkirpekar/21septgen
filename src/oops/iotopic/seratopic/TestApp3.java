package oops.iotopic.seratopic;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import oops.iotopic.seratopic.Student;
public class TestApp3 
{
	public static void main(String[] args) 
	{
		Student s[] = new Student[5];
		for (int i = 0; i < s.length; i++) 
		{
			s[i] = new Student();
			s[i].scan();
		}
		try (
				FileOutputStream fout = new FileOutputStream("listofstudents.txt");
				ObjectOutputStream out = new ObjectOutputStream(fout);
			)
		{
			out.writeObject(s);
			System.out.println("sucess");
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}