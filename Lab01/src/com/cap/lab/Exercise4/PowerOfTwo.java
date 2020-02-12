package com.cap.lab.Exercise4;


public class PowerOfTwo 
{
	static boolean checkNumber(int n)
	{
		if(n==0)
		{
			return false;
		}
		while(n!=1)
		{
			if(n%2!=0)
			{
				return false;
			}
			n=n/2;
		}
		return true;
	}
	public static void main(String args[])
	{
		PowerOfTwo num=new PowerOfTwo();
		System.out.println(num.checkNumber(32));
	}

}

