package com.Opps_concept;

import java.util.ArrayList;

public class BigInt {
	

		ArrayList<Integer> myNumber = new ArrayList <Integer>();        

		public BigInt(){}

		public BigInt(String number)
		{ 
			for(int i=0; i<number.length(); i++)
				{ 
				myNumber.add(number.indexOf(i));
				
				} 
			}

		

}
