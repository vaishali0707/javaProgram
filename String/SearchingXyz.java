package com.cap.prac.example1;

public class SearchingXyz {
	
	public static boolean xyzThere(String s)
	{
		if(s.contains("xyz"))
		{
			if(s.contains("."))
			{
			if(s.indexOf(".")<s.indexOf("xyz"))
			{
				return false;
			}
			}
			return true;
		}
		return false;
		
	}
	
	public static void main(String[] args)
	{
	 	
		System.out.println(xyzThere("xyz.abc"));
	}

}
