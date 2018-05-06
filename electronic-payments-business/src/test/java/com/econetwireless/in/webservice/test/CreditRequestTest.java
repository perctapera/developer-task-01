package com.econetwireless.in.webservice.test;

import static org.junit.Assert.assertEquals;
import com.econetwireless.in.webservice.CreditRequest;
import org.junit.Before;
import org.junit.Test;

public class CreditRequestTest {

	//@Mock
	CreditRequest creditRequest;

	@Before
	public void init(){
		//MockitoAnnotations.initMocks(this);
		creditRequest=new CreditRequest();
	}
	@Test
	public void testGetAmount() {
		creditRequest.setAmount(7.00);
		assertEquals(7.00,creditRequest.getAmount(),0);
	}

	@Test
	public void testSetAmount() {
		creditRequest.setAmount(7.00);
		assertEquals(7.00,creditRequest.getAmount(),0);
	}

	@Test
	public void testGetMsisdn() {
		creditRequest.setMsisdn("778087468");
		assertEquals("778087468",creditRequest.getMsisdn());
	}

	@Test
	public void testSetMsisdn() {
		creditRequest.setMsisdn("778087468");
		assertEquals("778087468",creditRequest.getMsisdn());
	}

	@Test
	public void testGetPartnerCode() {
		creditRequest.setPartnerCode("hot-recharge");
		assertEquals("hot-recharge",creditRequest.getPartnerCode());
	}

	@Test
	public void testSetPartnerCode() {
		creditRequest.setPartnerCode("hot-recharge");
		assertEquals("hot-recharge",creditRequest.getPartnerCode());
	}

	@Test
	public void testGetReferenceNumber() {
		creditRequest.setReferenceNumber("ref-001");
		assertEquals("ref-001",creditRequest.getReferenceNumber());
	}

	@Test
	public void testSetReferenceNumber() {
		creditRequest.setReferenceNumber("ref-001");
		assertEquals("ref-001",creditRequest.getReferenceNumber());
	}

}
