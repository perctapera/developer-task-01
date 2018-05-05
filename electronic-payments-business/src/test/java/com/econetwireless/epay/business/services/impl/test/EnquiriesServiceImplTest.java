package java.com.econetwireless.epay.business.services.impl.test;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;
import static org.powermock.api.mockito.PowerMockito.*;
import static org.powermock.api.support.membermodification.MemberMatcher.method;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.exceptions.misusing.UnfinishedStubbingException;
import org.powermock.api.mockito.PowerMockito;

import com.econetwireless.epay.business.integrations.api.ChargingPlatform;
import com.econetwireless.epay.business.services.impl.CreditsServiceImpl;
import com.econetwireless.epay.business.services.impl.EnquiriesServiceImpl;
import com.econetwireless.epay.dao.subscriberrequest.api.SubscriberRequestDao;
import com.econetwireless.epay.domain.SubscriberRequest;
import com.econetwireless.utils.pojo.INBalanceResponse;
import com.econetwireless.utils.pojo.INCreditResponse;

public class EnquiriesServiceImplTest {

	private EnquiriesServiceImpl enquiriesServiceImpl;
	@Mock
	private ChargingPlatform chargingPlatform;
	
	//@Mock
	SubscriberRequest subscriberRequest;

	//@Mock
	INBalanceResponse inBalanceResponse;
	
	@Mock
	private SubscriberRequestDao subscriberRequestDao;
	 
	@Before
	public void testEnquiriesServiceImpl() {
		MockitoAnnotations.initMocks(this);
		inBalanceResponse=new INBalanceResponse();
		enquiriesServiceImpl=new EnquiriesServiceImpl(chargingPlatform, subscriberRequestDao);
	}

	/*@Test(expected=Exception.class)
	public void testEnquire() throws Exception {		
		 EnquiriesServiceImpl spy=PowerMockito.spy(enquiriesServiceImpl);
		 inBalanceResponse.setResponseCode("200");
			PowerMockito.doThrow(new NullPointerException()).when(spy, "changeSubscriberStateOnBalanceEnquiry",	subscriberRequest, inBalanceResponse);
			verifyPrivate(spy, atLeastOnce()).invoke("changeSubscriberStateOnBalanceEnquiry",Matchers.any(SubscriberRequest.class), Matchers.any(INBalanceResponse.class));
			
	}*/

}
