package com.cap.lab.Exercise3;
import java.util.*;

public class Pipe 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String reverse="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			reverse=reverse+s1.charAt(i);
		}
		System.out.println(s1+"|"+reverse);
		
	}

}
