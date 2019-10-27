package com.Opps_concept;

public class Bank {

	public String name;
	private long  mobile;
	private int balance;
	public void setMobile(long mobile)
	{
		int count=0;
		while(mobile>0)
		{
			count++;
			mobile=mobile/10;
		}
		if(count==9)
		{
			this.mobile=mobile;
			System.out.println("Your mobile number is set ");
		}
		else
		{
			System.out.println("Your mobile number is not valid ");
		}
	}
	public long getMobile()
	{
		return mobile;
	}
	public void depositAmount(int amount)
	{
		updateBalanceDeposit(amount);
		System.out.println("Your amount of "+amount+"is been deposit succesfully");
	}
	private void updateBalanceDeposit(int amount)
	{
		balance=balance+amount;
		
	}
	public void withdrawAmount(int amount)
	{
		if(balance>amount)
		{
			updateBalanceOnWithdrawal(amount);
			System.out.println("your withdrawal amount is "+amount);
		}
		else
		{
			System.out.println("You Don't have sufficient balance");
		}
	}
private void updateBalanceOnWithdrawal(int amount)
{
	balance=balance-amount;
}
}
