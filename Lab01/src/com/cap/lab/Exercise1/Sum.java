package com.cap.lab.Exercise1;


public class Sum
{
	int n;
	int sum=0;
	int calculateSum(int n)
	{
		for(int i=0;i<n;i++)
		{
			if(i%3==0 ||i%5==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
	public static void main(String args[])
	{
		Sum s=new Sum();
		System.out.println(s.calculateSum(10));
	}

}
