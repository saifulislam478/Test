package com.Opps.Compare;

public class Student implements Comparable<Student>
{
	String sname ;
	int sid;
	
	public Student(String sname,int sid)
	{
		this.sname=sname;
		this.sid=sid;
	}

	
	public int compareTo(Student o) {
		if(this.sid>o.sid)
			return 1;
		else
		
		return -1;
	}
	
	public String toString()
	{
		return sname;
		
	}
	
	public boolean equals(Object o)
	{
		if(this.sid==((Student)o).sid)
			return true;
		else 
		return false;
		
	}
	
	
}     