package oops.dateandtimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		LocalDate localDate  = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		
		LocalDateTime localDateTime = LocalDateTime.now();

		System.out.println("localDate - " + localDate);
		System.out.println("localTime - " + localTime);
		System.out.println("localDateTime - " + localDateTime);
		
		LocalDate yesterday = localDate.minusDays(1);
		System.out.println(yesterday);
		
		LocalDate  tomorrow = localDate.plusDays(2);
		System.out.println(tomorrow);
		
		LocalDate date1 =  LocalDate.of(2023, 1, 1);
		System.out.println(date1);
		
		LocalDateTime timeAndDate = date1.atTime(12,15,25);
		
		System.out.println(timeAndDate);//2023-01-01T12:15:25
		
		LocalDate d1 = LocalDate.now(); 
		String d1Str = d1.format(DateTimeFormatter.ISO_DATE);  
		System.out.println("Date1 in string :  " + d1Str);  
		LocalDate valueAsDate =  LocalDate.parse(d1Str);
		System.out.println("valueAsDate" + valueAsDate);
	}
}