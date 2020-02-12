package com.cap.prac.example1;

public class RepeatEndDemo {

	public static String repeatEnd(String s,int n)
	{
		StringBuffer str=new StringBuffer();
		for(int i=0;i<n;i++)
		{
			str.append(s.substring(0,n));
		}
		return str.toString();
		
	}
	public static void main(String[] args)
	{
		System.out.println(repeatEnd("hello",2));
	}
}