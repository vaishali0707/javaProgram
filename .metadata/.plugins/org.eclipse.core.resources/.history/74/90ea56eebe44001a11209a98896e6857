package com.cap.lab.Exercise6;
import java.util.*;
import java.io.*;
public class NumberOfCharacter
{
	public static void main(String args[])throws Exception
	{
	int nl=1,nw=0;
	char ch;
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	FileInputStream fis=new FileInputStream(s);
	int n=fis.available();
	for(int i=0;i<n;i++)
	{
		ch=(char)fis.read();
		if(ch=='\n')
		{
			nl++;
		}
		else if(ch==' ')
		{
			nw++;
		}
	}
	System.out.println("No. of lines "+nl);
	System.out.println("No. of words "+(nw+nl));
	System.out.println("No. of character "+n);
	
}
}
