package com.cap.prac.example1;

public class MixStringDemo {
	
	public String mixString(String s1,String s2)
	{
		StringBuffer strBuff=new StringBuffer();
		int i=0;
		while(i<s1.length()|| i<s2.length())
		{
			if(i<s1.length())
			{
				strBuff.append(s1.charAt(i));
			}
			
			if(i<s2.length())
			{
				strBuff.append(s2.charAt(i));
			}
			i++;
		}
		return strBuff.toString();
		
	}
	
	public static void main(String[] args)
	{
		MixStringDemo mStr=new MixStringDemo();
		System.out.println(mStr.mixString("hello","world"));
	}

}
