package Test;
import java.util.*;


public class StudentClass 
{
	public static ArrayList<String> removeDuplicates(ArrayList<String>a)
	{
		Set<String> s1=new HashSet<String>();
		s1.addAll(a);
		a.clear();
		a.addAll(s1);
		return a;
		
	}
	public static void main(String args[])
	{
		ArrayList<String> sc=new ArrayList<String>();
		sc.add("Vaishali");
		sc.add("Vishal");
		sc.add("Ashish");
		sc.add("Vishal");
		System.out.println("Without removing "+sc);
		ArrayList<String>newList=removeDuplicates(sc);
		System.out.println("After removing"+newList);	
		}
}
