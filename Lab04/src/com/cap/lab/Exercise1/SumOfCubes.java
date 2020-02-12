package com.cap.lab.Exercise1;

public class SumOfCubes
	{
		int findSum(int n)
		{
			int sum=0,digit=0;
			while(n>0)
			{
				digit=n%10;
				sum=sum+(digit*digit*digit);
				n=n/10;	
			}
			return sum;
		}
		public static void main(String args[])
		{
			SumOfCubes sc=new SumOfCubes();
			System.out.println(sc.findSum(1412));
		}

	}

