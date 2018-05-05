package java.com.econetwireless.in.webservice.test;

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
		creditResponse.setMsisdn("773248969");
		assertEquals("773248969", creditResponse.getMsisdn());
	}

	@Test
	public void testSetMsisdn() {
		creditResponse.setMsisdn("773248969");
		assertEquals("773248969", creditResponse.getMsisdn());
	}

	@Test
	public void testGetNarrative() {
		creditResponse.setNarrative("narative bla bla");
		assertEquals("narative bla bla", creditResponse.getNarrative());
	}

	@Test
	public void testSetNarrative() {
		creditResponse.setNarrative("narative bla bla");
		assertEquals("narative bla bla", creditResponse.getNarrative());
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
