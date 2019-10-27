package com.Opps.Compare;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DuplicateCount
{

	
public void CharactCount()
{
	
	String str="Grreeeeek";
	Map<Character, Integer> map=new HashMap<Character,Integer>();
	char[] cArray=str.toCharArray();
	
	int counter=0;
	for(char ch : cArray)
	{
		if(map.containsKey(ch))
		{
			counter= map.get(ch);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
			
			map.put(ch, ++counter);
		
		}
		
		
		else
		{
			map.put(ch, 1);
		}
		
		/*if(counter>1)
		{
			System.out.println("first Duplicate elemet  " +ch+" "+counter); //find out first duplicate element from a word
			break;
		}*/
	}
	/*for(char che:map.keySet())
	{
		if(map.containsKey(che))
	{
		int counter=map.get(che);
		                                                                                                                                                                                               
		
	}
	}*/
	
	
	for(Character k:map.keySet())
	{
	 System.out.println(k+" "+map.get(k)); //map.get(k) return the values--k is the key
	}
	/*for(int cr:map.values())
	{
	 System.out.println(cr);
	}*/
	
	map.forEach((key, value) -> {
		System.out.println( key+"--->"+value);
		//System.out.println(", Value: "+ value);
		});

	
		Set<Character> set=map.keySet();
		
		Iterator<Character> itr= set.iterator();
		char ch;
		while(itr.hasNext())
		{
			ch=itr.next();
			System.out.println(ch+"====" +map.get(ch));
			
		}
	
}
}



	
	
	
	

