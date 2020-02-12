package com.cap.lab.Exercise3;

public class IncreasingNumber 
{
	boolean checkNumber(int number)
	{
		boolean flag= false;
		int m=number%10;
		number=number/10;
		while(number>0)
		{
			if(m>number%10)
			{
				flag=true;
				break;
			}
		}
		m=number%10;
		number=number/10;
		if(flag)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	public static void main(String args[])
	{
		IncreasingNumber num=new IncreasingNumber();
		System.out.println(num.checkNumber(123));
	}
}
