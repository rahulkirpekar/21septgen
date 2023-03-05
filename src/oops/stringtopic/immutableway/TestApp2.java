package oops.stringtopic.immutableway;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		StringBuffer value1 = new StringBuffer("royal");

		System.out.println(value1);
		
		value1.reverse();
		
		System.out.println(value1);
		
		
//		String value1 ="10";x
//		String value2 ="20";
//		int no1 = Integer.parseInt(value1);
//		int no2 = Integer.parseInt(value2);
//		int ans = no1 + no2;
//		System.out.println("Addition : " + ans);
//		int no3 = 200;
//		int no4 = 400;
//		String value3 = String.valueOf(no3);
//		String value4 = String.valueOf(no4);
//		System.out.println(value3 + value4);
		
		
		
		// AutoBoxing Rule---primitive to Object
//		Integer valueInt = no1; //Integer.valueOf(no1)
		
		// UnBoxing Rule---object to Primitive
//		no1 = valueInt ;// valueInt.intValue()
		
		
		
//		System.out.println(valueInt+200);
		 
		
		
		
		
//		wrapperClass--->String to Primitive(8)

//		String value1 = "20";
//		String value2 = "10";
		
		
//		System.out.println(value1 + value2);
		
		
		
		
//		(8)Primitive to String --valueOf()
		
//		int no1 = 10;
//		int no2 = 20;
		
//		String valueOfNo1 = String.valueOf(no1);
//		String valueOfNo2 = String.valueOf(no2);
		
		
//		System.out.println("valueOfNo1 : " + valueOfNo1);
//		System.out.println("valueOfNo2 : " + valueOfNo2);
//		System.out.println("Addition : " + (valueOfNo1 + no2));//1020
		
//		System.out.println("ABC" + 10 +" - " + ("ABC" + 10));
		//  "ABC" + 10 ----ABC10
		// string + int ---concatenation
		// 10 + "ABC" -----10ABC
		// int + string ---concatenation
		
		// 10 + 20 + "ABC"--------30ABC
		// int  + int + string ---addition + concatenation

		
		//  10 + "ABC" + 20 + " DEF"---10ABC20DEF
		// int  + String  + int + string ---concatenation

		
		//  "ABC"  + 10 + 20 = ABC1020
		// String  + int + int---concatenation
		
		
		
		
		
		
//		System.out.println("Enter Name : ");
//		String usrName = new Scanner(System.in).nextLine();// admin/Admin/AdMiN
//		System.out.println("usrName.length() - " + usrName.length());

		// Royal Technosoft 
//		usrName = usrName.trim(); 
//		System.out.println("usrName.length() - " + usrName.length());
		
//		if ("ADMIN".equals(usrName.toUpperCase())) 
//		{
//			System.out.println("UserName matched");
//		} else 
//		{
//			System.out.println("UserName not matched");
//		} 
		
//		1) charArray to String
//		char name[] = {'R','a','h','u','l'};
//		String nameOfStr = new String(name);
//		System.out.println("String Object : " + nameOfStr);
		
//		2) String to charArray
//		String mainString = "This is Java which is developed by James Golsing";
				  //	     01234567890123456789012345678910

//		char mainStrArray[] = mainString.toCharArray();
		
//		for(char value : mainStrArray) 
//		{
//			System.out.print(value);
//		}
		
//	    String value1 = mainString.substring(22,31);	
//	    String value2 = mainString.substring(22);	

//		System.out.println(value1);
//		System.out.println(value2);
		
	}
}
