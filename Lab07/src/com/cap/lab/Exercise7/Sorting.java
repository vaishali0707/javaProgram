package com.cap.lab.Exercise7;

import java.util.Arrays;

public class Sorting 
{
	int[] getSorted(int[] arr)
	{
		int i=0;
		while(i<arr.length)
		{   
			StringBuilder str=new StringBuilder(Integer.toString(arr[i]));
			str.reverse();
			arr[i]=Integer.valueOf(str.toString());
			i++;
		}
		Arrays.sort(arr);
		
		return arr;
	}
}
