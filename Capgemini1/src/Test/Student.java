package Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class Student  
{
	 int id;
	 String name;
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return "Name is "+this.name+" Roll number "+this.id;
	}
}
class Demo
{
	public static void main(String args[])
	{
		try
		{
		Student s=new Student(1,"Vishal");
		System.out.println("s1 object: "+s);
		FileOutputStream fos=new FileOutputStream("student");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.flush();
		oos.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try
		{
			Student s2;
			FileInputStream fis=new FileInputStream("student");
			ObjectInputStream ois=new ObjectInputStream(fis);
			s2=(Student)ois.readObject();
			System.out.println("s2 Object:" +s2);
			ois.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
