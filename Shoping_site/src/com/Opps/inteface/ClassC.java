package com.Opps.inteface;

public class ClassC implements InterfaceA, InterfaceB
{
 public int add(int x,int y)
	{
		return x+y;
	}
	public int sub(int x,int y)
	{
		return x-y;
	}
private void Mu() {
	System.out.println("Inside private method");
	
}
 protected void Method1()
 {
	 System.out.println("Inside Protected methos");
 }
 
 public void getMu() {
	 Mu();
 }

 
}

 