package com.dateex;

import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class JodaTimeEx01 {

	public static void main(String[] args) {

		String today = new DateTime().toString(DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss"));
		System.out.println(today);
		
		LocalDateTime date = LocalDateTime.now();
		System.out.println(date);
		
		DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
		String dateString = date.toString(fmt);
		
		System.out.println(dateString);
	}

}
