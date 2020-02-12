package com.cap.lab.Exercise5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SecondSmallest 
{
		int getSecondSmallest(int arr[])
		{
			ArrayList<Integer>al=new ArrayList<Integer>();
			for(int l:arr)
			{
				al.add(l);
			}
			Collections.sort(al);
			return al.get(1);
			
		}
}
