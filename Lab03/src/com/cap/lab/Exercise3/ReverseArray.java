package com.cap.lab.Exercise3;

import java.util.Arrays;

public class ReverseArray 
{

	public int[] getSorted(int arr[])
	{
		int rev=0;
		for(int i=0;i<arr.length;i++)
		{
			while(arr[i]!=0)
			{
				rev=rev*10;
				rev=rev+arr[i]%10;
				arr[i]=arr[i]/10;
			}
			arr[i]=rev;
			rev=0;
		}
		Arrays.sort(arr);
		return arr;
	}
	public static void main(String args[])
	{
		ReverseArray r=new ReverseArray();
		int arr[]= {234,342,781,982};
		int a[]=new int[arr.length];
		a=r.getSorted(arr);
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		}
	}

}

