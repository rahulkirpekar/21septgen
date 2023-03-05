package oops.stringtopic.mutableway;

import java.util.List;
import java.util.stream.Collectors;

public class TestApp3 {
	public static void main(String[] args) 
	{
//		String s1="javatpoint is a very good website";  
//		String replaceString=s1.replace("good","abc");//replaces all occurrences of 'a' to 'e'  
//		System.out.println(replaceString);  

		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		List<Integer> evenList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		
		System.out.println(evenList);
		
	}
}
