package com.dateex;

import java.util.Calendar;

public class CalendarEx02 {

	public static void main(String[] args) {

		Calendar time = Calendar.getInstance();
		System.out.println(time.getTime());
		
		time.add(Calendar.SECOND, 120);
		System.out.println(time.getTime());
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		Calendar time3 = Calendar.getInstance();
		
		time2.set(1982, 12, 25);
		time3.set(2080, 12, 25);
		
		// ¹Ý´ë´Â after()
		System.out.println(time1.before(time2));
		System.out.println(time1.before(time3));
		
		
		Calendar time4 = Calendar.getInstance();
		System.out.println(time4.getTime());
		
		time4.set(Calendar.YEAR, 2020);
		System.out.println(time4.getTime());
		
		time4.set(2080, 1, 25);
		System.out.println(time4.getTime());
		
		
		
		
	}

}
