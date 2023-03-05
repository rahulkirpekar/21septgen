package oops.stringtopic.immutableway;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		String name1 = "devang";
		String name2 = "devang";
		String name3 = "devang".concat(" Patel");
		String name4 = name1;
		String name5 = "Sagar";
		String name6 = new String("rakesh");
		String name7 = new String("devang");
		String name8 = new String("rahul");
		String name9 = new String("rahul");
		String name10 = name9;
		
		System.out.println("name1 - "+name1 + " " + name1.hashCode());
		System.out.println("name2 - "+name2 + " " + name2.hashCode());
		System.out.println("name3 - "+name3 + " " + name3.hashCode());
		System.out.println("name4 - "+name4 + " " + name4.hashCode());
		System.out.println("name5 - "+name5 + " " + name5.hashCode());
		System.out.println("name6 - "+name6 + " " + name6.hashCode());
		System.out.println("name7 - "+name7 + " " + name7.hashCode());
		System.out.println("name8 - "+name8 + " " + name8.hashCode());
		System.out.println("name9 - "+name9 + " " + name9.hashCode());
		System.out.println("name10 - "+name10 + " " + name10.hashCode());

		name5 = name5.concat(" Khatri");
		System.out.println(name5 + " " + name5.hashCode());
		// references
		System.out.println("name1==name2 - " + (name1==name2));
		System.out.println("name1==name3 - " + (name1==name3));
		System.out.println("name1==name4 - " + (name1==name4));
		System.out.println("name1==name5 - " + (name1==name5));
		System.out.println("name1==name6 - " + (name1==name6));
		System.out.println("name1==name7 - " + (name1==name7));
		System.out.println("name8==name9 - " + (name8==name9));
		System.out.println("name9==name10 - " + (name9==name10));
		System.out.println("name8==name10 - " + (name8==name10));
	
		// equals method---values
		System.out.println("name1.equals(name2 )- " + (name1.equals(name2)));// true
		System.out.println("name1.equals(name3 )- " + (name1.equals(name3)));// false
		System.out.println("name1.equals(name4 )- " + (name1.equals(name4)));// true
		System.out.println("name1.equals(name5 )- " + (name1.equals(name5)));// false
		System.out.println("name1.equals(name6 )- " + (name1.equals(name6)));// false
		System.out.println("name1.equals(name7 )- " + (name1.equals(name7)));// true
		System.out.println("name8.equals(name9 )- " + (name8.equals(name9)));// true
		System.out.println("name9.equals(name10) - " + (name9.equals(name10)));// true
		System.out.println("name8.equals(name10) - " + (name8.equals(name10)));// true
	}
}