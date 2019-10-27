package com.Opps_concept;

import java.util.Scanner;

public class TestBank {
	public static void main(String[]args)
	{
		Bank b=new Bank();
		b.name="Saiful";
		System.out.println("Welcome to Bank \n Please enter the amount you want to Deposit");
		Scanner s=new Scanner(System.in);
		int amount=s.nextInt();
		
		b.depositAmount(amount);
		b.setMobile(980736583);
		System.out.println("Please enter the amount you want to Withdraw");
		Scanner d=new Scanner(System.in);
		int amount1=d.nextInt();
		b.withdrawAmount(amount1);
		long mob=b.getMobile();
		System.out.println(mob);
		
	}

}
