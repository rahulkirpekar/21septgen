package oops.stringtopic.objectequality;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		String name1 = "royal";
//		System.out.println("name1 - " + name1.toString());
//		System.out.println("name1.hashCode() - " + name1.hashCode());

		Student s = new Student();
		s.setData(1, "rahul", 12);
		
		System.out.println("s object -- " + s);
		System.out.println("s object.toString() -- " + s.toString());
		
	}
}
