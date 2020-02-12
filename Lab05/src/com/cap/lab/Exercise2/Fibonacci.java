package com.cap.lab.Exercise2;

public class Fibonacci 
{
	int fibUsingRecursion(int n)
	{
		if(n<=1)
			return 1;
		return fibUsingRecursion(n-1)+fibUsingRecursion(n-2);
	}
	void fib(int n)
	{
		int n1=1,n2=1,n3;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=0;i<n;i++)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;		
		}
	}
	public static void main(String args[])
	{
		Fibonacci f=new Fibonacci();
		System.out.println(f.fibUsingRecursion(8));
		f.fib(8);
	}

}
