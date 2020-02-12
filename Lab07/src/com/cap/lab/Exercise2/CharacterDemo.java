package com.cap.lab.Exercise2;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class CharacterDemo
{
	public static HashMap<Character,Integer> countCharacter(char arr[])
	{
		HashMap<Character, Integer> CountMap = new HashMap<Character, Integer>(); 
		for (char c : arr) 
		{ 
            if (CountMap.containsKey(c))
            { 
                 CountMap.put(c, CountMap.get(c) + 1); 
            } 
            else
            { 

                CountMap.put(c, 1); 
            } 
        } 
       
            return CountMap; 		
	}
}


