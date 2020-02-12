package com.cap.lab.Exercise4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StudentMedal 
{
	public static void getStudents(HashMap<Integer,Integer>map)
	{
		HashMap<Integer,String>hmap=new HashMap<Integer, String>();
		
		for (Entry<Integer, Integer> entry : map.entrySet())
		{

			if(entry.getValue()>=90)
			{
				hmap.put(entry.getKey(),"Gold");
			}
			else if(entry.getValue()>=80 && entry.getValue()<90)
			{
				hmap.put(entry.getKey(),"Silver");
			}
			else if(entry.getValue()>=70 && entry.getValue()<80)
			{
				hmap.put(entry.getKey(),"Bronze");
			}
			else
			{
				hmap.put(entry.getKey(),"No Award");
			}
		
		}
		
		System.out.print(hmap);
	}
	
	public static void main(String args[])
	{
		HashMap<Integer,Integer>h=new HashMap<Integer,Integer>();
		h.put(1,80);
		h.put(2,99);
		h.put(3,78);
		h.put(4,50);

		getStudents(h);
	}
	

}
