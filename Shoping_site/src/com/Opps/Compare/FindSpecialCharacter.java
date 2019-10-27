package com.Opps.Compare;

public class FindSpecialCharacter {
	public void specialCharacterFind()
	{
		String str= "Saiful 1nkdsh3uenkewi07@$$#%^";
		//char[] numeric = null,character = null,spCharacter = null;
		StringBuffer numeric=new StringBuffer(), character=new StringBuffer(),spCharacter=new StringBuffer();
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				numeric.append(str.charAt(i));
			}
			else if(Character.isAlphabetic(str.charAt(i)))
			{
				character.append(str.charAt(i));
			}
			else
			{
				spCharacter.append(str.charAt(i));
			}
		}
		System.out.println("Number " +numeric);
		System.out.println("Character  "+character);
		System.out.println("Special Character "+spCharacter);
		System.out.println("=============================================================");
	}
	
	public void wordCount(String str)
	{
		String[] word=str.split(" ");
		int len=word.length;
		System.out.println("Number of word present in the string ---"+len);
		System.out.println(word[1]);
		String rev1=" ";
		
		String [] rev;
		rev =new String[len];
		
		  
		int j=0;
		for(int i=len-1;i>=0;i--)  //reverse string according to word
		
		{
			rev[j]=word[i];
			//System.out.println(word[i]);
			
			//System.out.println(i);
			j++;
		}
		
		for(int k=0;k<rev.length;k++)    //reverse string iteration
		{
			
		System.out.println("reverse string==="+rev[k]);
		
		}
		System.out.println(rev.toString());
	}
	

}
