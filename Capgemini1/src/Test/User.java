package Test;

import java.util.Arrays;

public class User 
{
	private String id;
	public void setId(String id)
	{
		this.id=id;
	}
	public String getId()
	{
		return id;
	}
}
class Id 
{
	public static User [] generateId(int n)
	{
		char ch='A';
		int value=1; 
		
        User u[]=new User[n];
         for(int i=0;i<n;i++)
         {
        	String s1=Character.toString(ch);
     		String s2=String.valueOf(value);
        	u[i]=new User();
        	String str=new String();
        	str=s1+s2;
        	u[i].setId(str);
        	//System.out.println(u[i].getId());
        	value++;
        	ch++;
        	
         }
         return u;
	}
	public static void main(String args[])
	{	
		User[] u1;
		u1=generateId(5);
		for(int i=0;i<5;i++)
		{
			System.out.println(u1[i].getId());
		}
		
	}
	
}

