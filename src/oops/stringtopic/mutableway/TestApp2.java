package oops.stringtopic.mutableway;
public class TestApp2 
{
	public static void main(String[] args) 
	{
//		String name[] = new String[5];// .length----operator---ArraySize
		String name = "rahul";//----.length()--method---length of String

		boolean flag= true;
		for (int i = 0,j=(name.length()-1); i < name.length(); i++,j--) 
		{
			if(name.charAt(i)!=name.charAt(j)) 
			{
				flag= false;
				break;
			}
		}
		if(flag) 
		{
			System.out.println("name is Palindrome : "+name);
		}else 
		{
			System.out.println("name is not Palindrome : "+name);
		}
//		for (int i = 0; i < name.length(); i++) 
//		{
//			System.out.println(name.charAt(i));
//		}
//		System.out.println("String name  length : " + name.length());
	}
}
