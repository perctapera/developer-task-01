package econetwireless.in.webservice.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.econetwireless.in.webservice.BalanceResponse;
import com.econetwireless.in.webservice.EnquireBalanceResponse;

public class EnquireBalanceResponseTest {

	
	EnquireBalanceResponse enquireBalanceResponse;
	@Mock
	BalanceResponse balanceResponse;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		enquireBalanceResponse=new EnquireBalanceResponse();
	}

	@Test
	public void testGetReturn() {
		enquireBalanceResponse.setReturn(balanceResponse);
		assertEquals(balanceResponse, enquireBalanceResponse.getReturn());
	}

	@Test
	public void testSetReturn() {
		enquireBalanceResponse.setReturn(balanceResponse);
		assertEquals(balanceResponse, enquireBalanceResponse.getReturn());
	}

}
