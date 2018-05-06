package com.econetwireless.in.webservice.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.econetwireless.in.webservice.CreditResponse;

public class CreditResponseTest {

	CreditResponse creditResponse;
	@Before
	public void setUp() {
		creditResponse=new CreditResponse();
	}

	@Test
	public void testGetBalance() {
		creditResponse.setBalance(10.00);
		assertEquals(10.00, creditResponse.getBalance(),0);
	}

	@Test
	public void testSetBalance() {
		creditResponse.setBalance(10.00);
		assertEquals(10.00, creditResponse.getBalance(),0);
	}

	@Test
	public void testGetMsisdn() {
		creditResponse.setMsisdn("778087468");
		assertEquals("778087468", creditResponse.getMsisdn());
	}

	@Test
	public void testSetMsisdn() {
		creditResponse.setMsisdn("778087468");
		assertEquals("778087468", creditResponse.getMsisdn());
	}

	@Test
	public void testGetNarrative() {
		creditResponse.setNarrative("narrative cr resp");
		assertEquals("narative cr resp", creditResponse.getNarrative());
	}

	@Test
	public void testSetNarrative() {
		creditResponse.setNarrative("narative cr resp");
		assertEquals("narative cr resp", creditResponse.getNarrative());
	}

	@Test
	public void testGetResponseCode() {
		creditResponse.setResponseCode("ResponseCode");
		assertEquals("ResponseCode", creditResponse.getResponseCode());
	}

	@Test
	public void testSetResponseCode() {
		creditResponse.setResponseCode("ResponseCode");
		assertEquals("ResponseCode", creditResponse.getResponseCode());
	}

}
