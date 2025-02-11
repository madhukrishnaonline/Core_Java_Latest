package com.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class RegisteredDate 
{
	public static void main(String[] args) 
	{
		System.out.println("============Local Date ============");
	     	LocalDate localDate = LocalDate.now();
	     	System.out.println("Local Date :: "+localDate);
	     	
	     	System.out.println("Day of the Month :: "+localDate.getDayOfMonth()
	     	                               +"\nDay of the Year ::  "+localDate.getDayOfYear()
	     	                               +"\nDay of the Week ::  "+localDate.getDayOfWeek()
	     	                               +"\n "+localDate.getChronology()
	     	                               +"\nLength Of Year ::  "+localDate.lengthOfYear()
	     	                               +"\nLength of Month :: "+localDate.lengthOfMonth()
	     	                               +"\n"+LocalDate.MAX+"\nMin"+LocalDate.MIN
	     	                               +"\n"+localDate.atStartOfDay());
	     	localDate = LocalDate.of(2022, 4, 16);
	     	System.out.println(localDate);
	     	
	     	System.out.println("============Local Time============");
	     	LocalTime localTime = LocalTime.now();
	     	System.out.println("Local Time :: "+localTime);
	     	
	     	System.out.println("Hour :: "+localTime.getHour()+"\nMinute :: "+localTime.getMinute()
	     	                                     +"\nSeconds :: "+localTime.getSecond()+"\nNano :: "+localTime.getNano()
	     	                                     +"\n"+LocalTime.MAX+"\nMin :: "+LocalTime.MIN);
	     	
	     	System.out.println("============Local DateTime============");
	     	LocalDateTime localDateTime = LocalDateTime.now();
	     	System.out.println("Local Date Time :: "+localDateTime);
	     	
	     	Period period = Period.between(LocalDate.of(2000,6,24), LocalDate.now());
	     	System.out.println("Age :: "+period+"\nAge Years :: "+period.getYears()
	     	                                   +"\nAge Months ::"+period.getMonths()+"\nAge Days :: "+period.getDays());
	     	System.out.println(period = Period.ofWeeks(2)); 
	     	System.out.println(LocalDate.of(2020,02,28).isLeapYear());
	     	
	     	Period period2 = Period.between(LocalDate.of(1999,11,20), LocalDate.now());
	     	System.out.println(period2+" "+period2.getMonths());
	     	
	     	System.out.println(LocalDate.now().plusYears(6));
	     	
	}//main
}//class