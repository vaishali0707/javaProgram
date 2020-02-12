package com.cap.lab.Exercise2;

public class Difference 
{
	int sumOfSquare=0;
	int squareOfSum=0;
	void calculateDifference(int n)
	{
		for(int i=1;i<=n;i++)
		{
			sumOfSquare=sumOfSquare+(i*i);
			squareOfSum=squareOfSum+i;
		}
		squareOfSum=squareOfSum*squareOfSum;
		System.out.println(sumOfSquare-squareOfSum);
		
	}

	public static void main(String[] args) 
	{
		Difference d=new Difference();
		d.calculateDifference(3);
	}

}
