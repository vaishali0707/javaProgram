package com.cap.lab.Exercise10;

public class JobSeeker 
{
		void detail(String name)
		{
			String s1="job";
			int lastIndex=name.lastIndexOf('_');
			if(name.substring(lastIndex+1).equals(s1) && lastIndex>=8)
			{
				System.out.println(name);
			}
			else
			{
				System.out.println("Invalid username ");
			}
		}	

}
