package com.cap.lab.Exercise4;

public class ValidateName extends Exception
{
	String firstName;
	String lastName;
	ValidateName(String firstName,String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public String toString()
	{
		return "No name to Display";
	}
}
class UserException
{
	public static void checkName(String firstName,String lastName)throws ValidateName
	{
		if(firstName.length()==0 && lastName.length()==0)
		{
			throw new ValidateName(firstName,lastName);
		}
		System.out.println(firstName+ " "+lastName);
	}
}
class ValidName
{
	public static void main(String args[])
	{
		UserException u=new UserException();
		try
		{
			u.checkName("", "");
		}
		catch(ValidateName v)
		{
			System.out.println(v);
		}
	}
}

