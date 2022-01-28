package com.weekday;

import java.time.LocalDate;
import java.util.Scanner;

class Result{
	
	public static String findDay(int day,int month,int year) {
		LocalDate ld=  LocalDate.of(year,month,day);
		return ld.getDayOfWeek().toString();
	}
}
public class SolutionOfWeekday {

	 public static void main(String[] args)  {	 
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter Date");
		 int day = scan.nextInt();
		 System.out.println("Enter month");
		 int month=scan.nextInt();
		 System.out.println("Enter year");
		 int year =scan.nextInt();
		 
		 String res = Result.findDay(day, month, year);
		 System.out.println(res);
	    }
}
