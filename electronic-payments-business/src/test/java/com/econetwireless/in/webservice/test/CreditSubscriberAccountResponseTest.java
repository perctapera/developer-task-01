package java.com.econetwireless.in.webservice.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.econetwireless.in.webservice.CreditResponse;
import com.econetwireless.in.webservice.CreditSubscriberAccountResponse;

public class CreditSubscriberAccountResponseTest {

	CreditSubscriberAccountResponse creditSubscriberAccountResponse;
	@Mock
	CreditResponse creditResponse;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		creditSubscriberAccountResponse=new CreditSubscriberAccountResponse();
		creditSubscriberAccountResponse.setReturn(creditResponse);
	}

	@Test
	public void testGetReturn() {
		assertEquals(creditResponse, creditSubscriberAccountResponse.getReturn());
	}

}
