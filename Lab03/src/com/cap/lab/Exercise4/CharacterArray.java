package com.cap.lab.Exercise4;

import java.util.*;

 public class CharacterArray {
    char arr[];
    int freq[];
	CharacterArray(char[] arr)
	{
        this.arr=arr;
        freq=new int[arr.length];
    }
     
    
	void count()
	{
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			freq[i]=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[i+1])
				{
                freq[i]++;
                arr[j] = '0';  
				}
			}
		}
		for(int i = 0; i <freq.length; i++)
		{
            if(arr[i] != ' ' && arr[i] != '0')  
			System.out.println(arr[i]+" "+freq[i]);
		}
			
	}

	public static void main(String[] args) 
	{
		char []arr1={'V','a','i','s','h','a','l','i'};
	        CharacterArray a=new CharacterArray(arr1);
	        a.count();

	}

}
