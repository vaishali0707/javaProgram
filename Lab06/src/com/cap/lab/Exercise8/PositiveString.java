package com.cap.lab.Exercise8;
import java.util.Arrays;
import java.util.Scanner;

public class PositiveString 
{
	boolean isPositiveString(String s) 
	{
		int n=s.length();
		char arr[]= s.toCharArray();
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]>arr[i+1])
				return false;
				
		}
		return true;
	}
	public static void main(String args[])
	{
		String s="ANT";
		PositiveString p=new PositiveString();
		System.out.println(p.isPositiveString(s));
	}

}

