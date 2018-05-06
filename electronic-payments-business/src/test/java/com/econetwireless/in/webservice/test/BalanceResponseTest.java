package com.econetwireless.in.webservice.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import com.econetwireless.in.webservice.BalanceResponse;

public class BalanceResponseTest {

	BalanceResponse balanceResponse;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		balanceResponse=new BalanceResponse();
	}

	@Test
	public void testGetAmount() {
		balanceResponse.setAmount(12.00);
		assertEquals(12.00, balanceResponse.getAmount(),0);
	}

	@Test
	public void testSetAmount() {
		balanceResponse.setAmount(12.00);
		assertEquals(12.00, balanceResponse.getAmount(),0);
	}

	@Test
	public void testGetMsisdn() {
		balanceResponse.setMsisdn("778087468");
		assertEquals("778087468", balanceResponse.getMsisdn());
	}

	@Test
	public void testSetMsisdn() {
		balanceResponse.setMsisdn("778087468");
		assertEquals("778087468", balanceResponse.getMsisdn());
	}

	@Test
	public void testGetNarrative() {
		balanceResponse.setNarrative("balance response narrative");
		assertEquals("balance response narrative ", balanceResponse.getNarrative());
	}

	@Test
	public void testSetNarrative() {
		balanceResponse.setNarrative("bla bla");
		assertEquals("balance response narrative ", balanceResponse.getNarrative());
	}

	@Test
	public void testGetResponseCode() {
		balanceResponse.setResponseCode("ResponseCode");
		assertEquals("ResponseCode", balanceResponse.getResponseCode());
	}

	@Test
	public void testSetResponseCode() {
		balanceResponse.setResponseCode("ResponseCode");
		assertEquals("ResponseCode", balanceResponse.getResponseCode());
	}

}
