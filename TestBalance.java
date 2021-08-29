package com.lti.ass2;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBalance {
	@Test
	public void validDepositWithdrawBalance() throws AmountException, BalanceException {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("ass2.xml"); //creating Container
		//instantiation happens here 
		Balance b = (Balance) appCtx.getBean("bal");
		b.deposit(1000.00);
		b.withdraw(100.00);
	
	}
	
	@Test
	public void invalidDepositBalance() throws AmountException {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("ass2.xml"); //creating Container
		Balance b = (Balance) appCtx.getBean("bal");
		b.deposit(00.00);
	
	}
	
	@Test
	public void invalidWithdrawBalance() throws AmountException, BalanceException {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("ass2.xml"); //creating Container
		Balance b = (Balance) appCtx.getBean("bal");
		b.withdraw(-1.00);
	
	}
	
	@Test
	public void insufficentBalance() throws AmountException, BalanceException {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("ass2.xml"); //creating Container
		Balance b = (Balance) appCtx.getBean("bal");
		b.deposit(1000.00);
		b.withdraw(2000.00);
	}
}
