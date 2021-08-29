package com.lti.ass2;

class AmountException extends Exception
{
	public AmountException(String msg)
	{
		super(msg);
	}
	
}

class BalanceException extends Exception
{
	public BalanceException(String msg)
	{
		super(msg);
	}
}

public class Balance {
	
	double depAmt,withAmt;
	double bal;
	
	public Balance()
	{
		System.out.println("Default cons");
	}
	public Balance(int amount)
	{
		System.out.println("Parameterized cons");
	}
	
	public void deposit(double depAmt) throws AmountException
	{
		System.out.println("The current balance is: "+bal);
		if(depAmt>0)
			{
			bal=bal+depAmt;
			System.out.println(depAmt+" has been deposited in your account. Current balance is "+bal);
			}
		else
			throw new AmountException("Enter a valid sum of money to deposit");
	}

	public void withdraw(double withAmt) throws BalanceException, AmountException
	{
		System.out.println("----------------------------------------------------------------------");
		System.out.println("The current balance is: "+bal);
		if(withAmt>0)
		{
		if(bal<withAmt)
			throw new BalanceException("Oops! You don't have sufficient balance:(");
		else
			{
			bal = bal-withAmt;
			System.out.println(withAmt+" is withdrawn from the account. Your current balance is "+bal);
			}
		}
		else
			throw new AmountException("The amount entered is invalid.");
	}
}
