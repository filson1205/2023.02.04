package com.greedy.section05.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application3 {

	public static void main(String[] args) {
		
		/* 올 해 크리스마스는 무슨요일일까요? */
		
		/* 2023년 12월 25일 월요일 형태로 출력  */

		int year = 2023;
		int month = 11;
		int dayOfMonth = 25;
		
		Calendar christmas = new GregorianCalendar(year, month, dayOfMonth);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 EEE요일");
		String result = sdf.format(new Date(christmas.getTimeInMillis()));
		
		System.out.println(result);
	}
	

}
