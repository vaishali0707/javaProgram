package com.cap.lab.Exercise7;
public class Controller 
{
	public static void main(String args[])
	{
		int arr[]= {123,981,657,421};
		Sorting sorted=new Sorting();
		arr=sorted.getSorted(arr);
		for(int i:arr)
		{
			System.out.println(i);
		}
	}

}
