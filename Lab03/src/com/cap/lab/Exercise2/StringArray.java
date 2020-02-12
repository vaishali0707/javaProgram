package com.cap.lab.Exercise2;

import java.util.Arrays;

public class StringArray 
{
	void perform(String arr[])
	{
		Arrays.sort(arr);
		int mid=arr.length/2;
		if(arr.length%2!=0)
		{
			mid=(arr.length/2)+1;
		}
		for(int i=0;i<mid;i++)
		{
			String s1=arr[i].toUpperCase();
			arr[i]=s1;
		}
		for(int i=mid;i<arr.length;i++)
		{
			String s2=arr[i].toLowerCase();
			arr[i]=s2;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}	
	}
	public static void main(String args[])
	{
		StringArray s=new StringArray();
		String arr[]= {"My","Name","is","Vishal"};
		s.perform(arr);
	}

}
