package com.cap.lab.Exercise9;
import java.time.*;
import java.util.*;

public class DateAndTime 
{

	   public static void main(String[] args)
	    {
		   Scanner sc=new Scanner(System.in);
		   int year=sc.nextInt();
		   int month=sc.nextInt();
		   int day=sc.nextInt();
		   LocalDate pdate = LocalDate.of(year,month,day);
	        LocalDate now = LocalDate.now();
	 
	        Period diff = Period.between(pdate,now );
	        int a=diff.getYears();
	        int b=diff.getMonths();
	        int c=diff.getDays();
	        System.out.println("Difference is "+a+" Years "+b+" Months "+c+" Days ");
	  }
}

