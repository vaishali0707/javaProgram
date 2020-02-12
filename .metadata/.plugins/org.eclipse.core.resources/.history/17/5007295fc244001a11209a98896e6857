package com.cap.lab.Exercise6;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class VotersList
{
	public static List votersList(HashMap<Integer,Integer>h)
	{
		ArrayList<Integer>list=new ArrayList();
		for(int i=1;i<=h.size();i++)
		{
			if(h.get(i)>=18)
			{
				list.add(h.get(i));
			}
			
		}
		return list;
	}
	public static void main(String args[])
	{
		HashMap<Integer,Integer>h=new HashMap();
		h.put(1,15);
		h.put(2,18);
		h.put(3,25);
		h.put(4,12);
		h.put(5,23);
		List l=votersList(h);
		System.out.println(l);
		
	}

}
