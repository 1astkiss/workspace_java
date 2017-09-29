package com.dateex;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx03 {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("��� ������ ���� �Է��ϼ���(ex ����: 2020, ��: 2");
		System.out.println("���� > ");
		int year = input.nextInt();
		System.out.println("�� > ");
		int month = input.nextInt();
		
		System.out.println("\n[" + year + "��" + month + "��]");
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
