package java.com.econetwireless.epay.business.utils.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.econetwireless.epay.business.utils.MessageConverters;
import com.econetwireless.in.webservice.BalanceResponse;
import com.econetwireless.in.webservice.CreditRequest;
import com.econetwireless.in.webservice.CreditResponse;
import com.econetwireless.utils.pojo.INBalanceResponse;
import com.econetwireless.utils.pojo.INCreditRequest;
import com.econetwireless.utils.pojo.INCreditResponse;

public class MessageConvertersTest {

	//@Mock
	MessageConverters messageConverters;
	
	@Mock
	private INCreditRequest inCreditRequest;

	@Mock
	private CreditRequest creditRequest;
	
	@Mock
	private CreditResponse creditResponse;
	
	@Mock
	private INCreditResponse increditResponse;
	
	@Mock
	private BalanceResponse balanceResponse;
	
	@Mock
	private INBalanceResponse inbalanceResponse;
	
	@Before
	public void intMocks() throws ClassNotFoundException{
		MockitoAnnotations.initMocks(this);	
		//Class.forName("com.econetwireless.epay.business.utils.MessageConverters");
		
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testConvertINCreditRequest() {
		inCreditRequest=new INCreditRequest();
		assertNotNull(messageConverters.convert(inCreditRequest));
		inCreditRequest=null;
		assertNull(messageConverters.convert(inCreditRequest));
		
	}

	@Test
	public void testConvertCreditRequest() {
		creditRequest=new CreditRequest();
		assertNotNull(messageConverters.convert(creditRequest));
		creditRequest=null;
		assertNull(messageConverters.convert(creditRequest));
	}

	@Test
	public void testConvertINCreditResponse() {	
		increditResponse=new INCreditResponse();
		assertNotNull(messageConverters.convert(increditResponse));
		increditResponse=null;
		assertNull(messageConverters.convert(increditResponse));
	}

	@SuppressWarnings("static-access")
	@Test
	public void testConvertCreditResponse() {
		creditResponse=new CreditResponse();
		assertNotNull(messageConverters.convert(creditResponse));
		creditResponse=null;
		assertNull(messageConverters.convert(creditResponse));
	}

	@SuppressWarnings("static-access")
	@Test
	public void testConvertINBalanceResponse() {
		inbalanceResponse=new INBalanceResponse();
		assertNotNull(messageConverters.convert(inbalanceResponse));
		inbalanceResponse=null;
		assertNull(messageConverters.convert(inbalanceResponse));
	}

	@SuppressWarnings("static-access")
	@Test
	public void testConvertBalanceResponse() {
		balanceResponse=new BalanceResponse();
		assertNotNull(messageConverters.convert(balanceResponse));
		balanceResponse=null;
		assertNull(messageConverters.convert(balanceResponse));
	}

}
