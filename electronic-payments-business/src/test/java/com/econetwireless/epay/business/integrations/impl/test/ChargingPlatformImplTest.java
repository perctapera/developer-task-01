package java.com.econetwireless.epay.business.integrations.impl.test;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.econetwireless.epay.business.integrations.impl.ChargingPlatformImpl;
import com.econetwireless.epay.business.utils.MessageConverters;
import com.econetwireless.in.webservice.CreditRequest;
import com.econetwireless.in.webservice.IntelligentNetworkService;
import com.econetwireless.utils.pojo.INCreditRequest;

public class ChargingPlatformImplTest {

	
	private ChargingPlatformImpl chargingPlatformImpl;
	@Mock
	IntelligentNetworkService intelligentNetworkService;
	
	@Mock
	INCreditRequest inCreditRequest;
	
	@Before
	public void initMocks(){
		MockitoAnnotations.initMocks(this);
		chargingPlatformImpl=new ChargingPlatformImpl(intelligentNetworkService);
		
	}

	@Test
	public void testEnquireBalance() {

	}

	@Test
	public void testCreditSubscriberAccount() {		

	}

}
