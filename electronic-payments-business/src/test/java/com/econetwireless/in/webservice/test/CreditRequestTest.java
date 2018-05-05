package java.com.econetwireless.in.webservice.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.econetwireless.in.webservice.CreditRequest;

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
		creditRequest.setAmount(10.00);
		assertEquals(10.00,creditRequest.getAmount(),0);
	}

	@Test
	public void testSetAmount() {
		creditRequest.setAmount(10.00);
		assertEquals(10.00,creditRequest.getAmount(),0);
	}

	@Test
	public void testGetMsisdn() {
		creditRequest.setMsisdn("773248969");
		assertEquals("773248969",creditRequest.getMsisdn());
	}

	@Test
	public void testSetMsisdn() {
		creditRequest.setMsisdn("773248969");
		assertEquals("773248969",creditRequest.getMsisdn());
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
