package com.cap.lab.Exercise1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class SortHashMap 
{
	static List getValues(HashMap<Integer,String>h)
	{
		ArrayList<String> valueList = new ArrayList<String>(h.values());
		Collections.sort(valueList);
		return valueList;
	}
	public static void main(String args[])
	{
		HashMap<Integer,String>h=new HashMap();
		h.put(1,"Vaishali");
		h.put(3,"Ashish");
		h.put(2,"Vishal");
		SortHashMap s=new SortHashMap();
		System.out.println(s.getValues(h));
		
	}

}

