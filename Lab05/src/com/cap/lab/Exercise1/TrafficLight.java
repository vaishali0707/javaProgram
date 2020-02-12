package com.cap.lab.Exercise1;

import java.util.*;

public class TrafficLight
{
	public static void main(String args[])
	{
		String arr[]= {"Red","Yellow","Green"};
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		switch(s)
		{
		case "Red":
			System.out.println("Stop");
			break;
		case "Yellow":
			System.out.println("Ready");
			break;
		case "Green":
			System.out.println("Go");
			break;
		default:
			System.out.println("Please select valid option");	
		}
	}

}
