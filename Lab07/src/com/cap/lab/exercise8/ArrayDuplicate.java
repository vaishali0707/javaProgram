package com.cap.lab.exercise8;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicate 
{
		public static ArrayList<Integer> removeDuplicates(ArrayList<Integer>a)
		{
			Set<Integer> s1=new HashSet<Integer>();
			s1.addAll(a);
			a.clear();
			a.addAll(s1);
			return a;
			
		}
		public static void main(String args[])
		{
			ArrayList<Integer> sc=new ArrayList<Integer>();
			sc.add(1);
			sc.add(3);
			sc.add(5);
			sc.add(5);
			System.out.println("Without removing "+sc);
			ArrayList<Integer>newList=removeDuplicates(sc);
			System.out.println("After removing"+newList);	
		}
}
