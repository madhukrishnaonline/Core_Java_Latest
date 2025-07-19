package com.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.time.Year;

public class TimeAPIExamples {
	public static boolean isLeapYear(long year) {
		return Year.isLeap(year);
	}

	public static void main(String[] args) {
		System.out.println(isLeapYear(2025));

		Year year = Year.of(2024);// .now();
		System.out.println("Year " + year);
		LocalDate atDay = year.atDay(366);
		System.out.println(atDay);

		LocalDate atMonthDay = year.atMonthDay(MonthDay.of(Month.JUNE, 24));
		System.out.println(atMonthDay);

		Duration duration = Duration.between(LocalDateTime.of(2000, 6, 24, 8, 45, 00), LocalDateTime.now());
		System.out.println("Days :: " + duration.toDays() + ", hours:: " + duration.toHours());

		Period period = Period.between(LocalDate.of(2000, 6, 24), LocalDate.now());
		System.out.println(period.getYears()+" "+period.getMonths()+" "+period.getDays());
		
		Month june = Month.JUNE;
		Month month = june.plus(2);
		System.out.println(month);
	}
}