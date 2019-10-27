package com.Opps.Compare;


import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class StudentDetails {

	
	public static  void main(String[] args) {
		
			FindSpecialCharacter sp=new FindSpecialCharacter();
			sp.specialCharacterFind();
			sp.wordCount("Saiful islam number para part 1");
			
		
		
		DuplicateCount dc=new DuplicateCount();
		dc.CharactCount();

List<Student> std=new ArrayList<Student>();
std.add(new Student("saiful",10));
std.add(new Student("Asharful",28));
std.add(new Student("Sai",1));
std.add(new Student("Anowar",88));

std.add(new Student("Kashem",11));

Collections.sort(std);
for(Student s:std)
{
	//System.out.println(s.sid + "----"+ s.sname);
}

	}

}
