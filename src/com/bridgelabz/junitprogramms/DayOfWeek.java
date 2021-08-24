package com.bridgelabz.junitprogramms;
import java.util.*;
public class DayOfWeek {

	public static void main(String[] args) {
		int month=0,day=0,year=0;
		Scanner sc= new Scanner(System.in);
		day= sc.nextInt();
		month=sc.nextInt();
		year=sc.nextInt();
		int y0=year-(14-month)/12;
		int x= y0+y0/4-y0/100+y0/400;
		int m0=month+12*((14-month)/12)-2;
		int d0=(day+x+31*m0/12)%7;
		System.out.println("The day of week is:"+d0);
		
	}

}
