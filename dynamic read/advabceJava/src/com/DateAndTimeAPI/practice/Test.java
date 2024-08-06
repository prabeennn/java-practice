package com.DateAndTimeAPI.practice;

import java.time.LocalDate;
import java.time.LocalTime;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		
		LocalTime ld1=LocalTime.now();
		System.out.println(ld1);
		
		int dd=ld.getDayOfMonth();
		int mm=ld.getMonthValue();
		int yyyy=ld.getYear();
		System.out.println(dd+".."+mm+".."+yyyy);
		System.out.printf("%d- %d-%d",dd,mm,yyyy);
		

	}

}
