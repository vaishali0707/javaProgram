package com.cap.lab.Exercise5;
import java.util.*;
import java.lang.String;

public class Modification 
{
	int modifyNumber(int number)
	{
		String s=Integer.toString(number);
		int a = 0;
		int i=0,j=1;
		StringBuffer sb = new StringBuffer();
		while(i<s.length()-1 && j<s.length())
		{
			a=Math.abs(s.charAt(j)-s.charAt(i));
			i++;
			j++;
			
			sb.append(a);
			
		}
		int b=Character.getNumericValue(s.charAt((s.length()-1)));
		sb.append(b);	
		String s1=sb.toString();
		int num=Integer.parseInt(s1);
		return num;	
	}

}
