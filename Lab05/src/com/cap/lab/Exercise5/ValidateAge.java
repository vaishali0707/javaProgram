package com.cap.lab.Exercise5;
public class ValidateAge extends Exception
{
		int age;
		ValidateAge(int age)
		{
			this.age=age;
		}
		public String toString()
		{
			return "Invalid Age, Age required is above 15";
		}
}
class User
{
	public static void checkAge(int age)throws ValidateAge
		{
			if(age<15)
			{
				throw new ValidateAge(age);
			}
			System.out.println("Age is valid");
		}

}
class ValidAge
{
	public static void main(String args[])
	{
		User u=new User();
		try
		{
			u.checkAge(13);
		}
		catch(ValidateAge v)
		{
			System.out.println(v);
		}
	}
}

