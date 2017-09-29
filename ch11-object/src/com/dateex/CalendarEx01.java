package com.dateex;

import java.util.Calendar;

public class CalendarEx01 {

	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		
		int year = today.get(Calendar.YEAR);
		// 0~11
		int month = today.get(Calendar.MONTH);
		int date = today.get(Calendar.DATE);
		
		month = month + 1;
		System.out.println(year + "년" + month +"월" + date + "일");
		
		// 1(일) ~ 7(토)
		int day = today.get(Calendar.DAY_OF_WEEK);
		String nday ="";
		
		System.out.println(day);
		switch(day) {
		case 1: nday="일"; break;
		case 2: nday="월"; break;	
		case 3: nday="화"; break;
		case 4: nday="수"; break;
		case 5: nday="목"; break;
		case 6: nday="금"; break;
		case 7: nday="토"; break;	
		}
		System.out.println(nday + "요일");
		
		// Calendar.AM(0)
		// Calendar.PM(1)
		int amPm = today.get(Calendar.AM_PM);
		String msg_amPm = (amPm == Calendar.AM)? "오전" : "오후" ;
		int hour = today.get(Calendar.HOUR);
		int min = today.get(Calendar.MINUTE);
		int sec = today.get(Calendar.SECOND);
		
		System.out.println(msg_amPm + " " 
				+ hour + "시" + min + "분" + sec + "초");
		
	}

}
