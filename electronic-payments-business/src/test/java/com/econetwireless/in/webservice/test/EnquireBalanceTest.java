package java.com.econetwireless.in.webservice.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.econetwireless.in.webservice.EnquireBalance;

public class EnquireBalanceTest {

	EnquireBalance enquireBalance;
	private String msisdin="773248969";
	private String partnerCode="hot-recharge";
	
	
	@Before
	public void init(){
		enquireBalance=new EnquireBalance();
	}
	@Test
	public void testGetPartnerCode() {
		enquireBalance.setPartnerCode(partnerCode);;
		assertEquals(partnerCode, enquireBalance.getPartnerCode());
	}

	@Test
	public void testSetPartnerCode() {
		enquireBalance.setPartnerCode(partnerCode);;
		assertEquals(partnerCode, enquireBalance.getPartnerCode());
	}

	@Test
	public void testGetMsisdn() {
		enquireBalance.setMsisdn(msisdin);
		assertEquals(msisdin, enquireBalance.getMsisdn());
	}

	@Test
	public void testSetMsisdn() {
		enquireBalance.setMsisdn(msisdin);
		assertEquals(msisdin, enquireBalance.getMsisdn());
	}

}
