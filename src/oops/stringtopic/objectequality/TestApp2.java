package oops.stringtopic.objectequality;

public class TestApp2 
{
	public static void main(String[] args) 
	{
//		String name1 ="rahul";
//		String name2 ="krunal";
//		System.out.println("(name1==name2) : " + (name1==name2));// == references -- true
//		System.out.println("(name1.equals(name2)) : " + (name1.equals(name2)));// .equals-- values -- true

		Student s1 = new Student();
		Student s3 = new Student();
		s1.setData(1, "rahul", 12);
		s3.setData(1, "rahul", 12);

//		System.out.println("s1.hashCode() : " + s1.hashCode());
//		System.out.println("s2.hashCode() : " + s2.hashCode());
		
//		System.out.println("s1==s2 " + (s1==s2));// == references
		System.out.println("s1(s1.equals(s3) " + (s1.equals(s3)));// == references
//		System.out.println("s1.name.equals(s2.name) - " + (s1.name.equals(s2.name)) );
		
	}
}
