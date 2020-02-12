package com.cap.lab.Exercise1;

import java.util.Arrays;

public class SecondSmallestElement
{
	int getSmallestElement(int arr[])
	{
		Arrays.sort(arr);
		return arr[1];
	}
	public static void main(String args[])
	{
		SecondSmallestElement num=new SecondSmallestElement();
		int arr[]= {7,5,4,8,2,1};
		System.out.println(num.getSmallestElement(arr));
	}

}

