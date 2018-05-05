package com.econetwireless.in.webservice.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import com.econetwireless.in.webservice.CreditRequest;
import com.econetwireless.in.webservice.CreditSubscriberAccount;

public class CreditSubscriberAccountTest {

	CreditSubscriberAccount creditSubscriberAccount;
	
	@Mock
	CreditRequest creditRequest;
	
	@Before
	public void setUp() throws Exception {
		creditSubscriberAccount=new CreditSubscriberAccount();
		creditSubscriberAccount.setCreditRequest(creditRequest);
	}

	@Test
	public void testGetCreditRequest() {
		creditSubscriberAccount.getCreditRequest();
	}

	@Test
	public void testSetCreditRequest() {
		creditSubscriberAccount.setCreditRequest(null);
		assertNull(creditSubscriberAccount.getCreditRequest());
	}

}
