package com.dateex;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx03 {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("희망 연도와 월을 입력하세요(ex 연도: 2020, 월: 2");
		System.out.println("연도 > ");
		int year = input.nextInt();
		System.out.println("월 > ");
		int month = input.nextInt();
		
		System.out.println("\n[" + year + "년" + month + "월]");
		calendar.set(year, month - 1, 1);
		
		int lastOfDate = calendar.getActualMaximum(Calendar.DATE);
		
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		for(int i=1;i<week;i++) {
			System.out.print("\t");
		}
		
		for(int i=1;i<=lastOfDate;i++) {
			System.out.print(i + "\t");
			
			if(week%7 == 0) {
				System.out.println();
			}
			week++;
		}
	}

}
