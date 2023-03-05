package oops.innerclasstopic;

interface Person
{
		public  abstract void eat();
}
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Person p = new Person() 
		{
			public void eat() 
			{
				System.out.println("Person -- eat() - " + getClass().getName());
			}
		};
		p.eat();
	}
}
