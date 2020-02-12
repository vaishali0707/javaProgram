package com.cap.lab.Exercise3;
import java.util.HashMap;

public class SquareOfValues 
{
	public static HashMap getSquare(int arr[])
	{
		HashMap<Integer,Integer>h=new HashMap();
		for(int i=0;i<arr.length;i++)
		{
			h.put(arr[i],arr[i]*arr[i]);
		}
		return h;
		
	}
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5,6};
		HashMap hmap=getSquare(arr);
		System.out.println(hmap);
	}

}

