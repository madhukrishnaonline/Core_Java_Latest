package com.util.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample 
{
	  public static void main(String[] args) throws ParseException 
	  {
		     Date date = new Date();
		     System.out.println("Date :: "+date);
		     
		     SimpleDateFormat dateFormat = new SimpleDateFormat();
		     String formatDate = dateFormat.format(date);
		     System.out.println("Format Date :: "+formatDate);
		     
		     Date digit2Year = dateFormat.get2DigitYearStart();
		     System.out.println(digit2Year);
		     
		     SimpleDateFormat dateFormat2 = new SimpleDateFormat("2024-12-15");
		     System.out.println("Date :: "+dateFormat2.toPattern());
             
		     boolean d = dateFormat2.parse("2024-12-15").before(date);
		     System.out.println(d);
		     
				/*  Date date2 = dateFormat.parse("2022-12-15");
				  System.out.println("Parsed Date :: "+date2);*/
		     
		     int april  = Calendar.APRIL;
		     System.out.println("Months Before April :: "+april);
	}//main
}//class