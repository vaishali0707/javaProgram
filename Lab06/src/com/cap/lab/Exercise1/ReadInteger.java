package com.cap.lab.Exercise1;

import java.util.StringTokenizer;

public class ReadInteger
{
	public static void main(String args[])
	{
		int sum=0;
		StringTokenizer st=new StringTokenizer("1 2 3 4 5 6"," ");
		while(st.hasMoreTokens())
		{
			String s = st.nextToken();
			System.out.print(s+"\n");
           sum=sum+Integer.valueOf(s);
		}
		System.out.println("\n"+sum);
	
	}
}
