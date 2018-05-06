package com.econetwireless.epay.business.services.impl.tests;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.econetwireless.epay.business.integrations.api.ChargingPlatform;
import com.econetwireless.epay.business.services.impl.CreditsServiceImpl;
import com.econetwireless.epay.dao.subscriberrequest.api.SubscriberRequestDao;
import com.econetwireless.epay.domain.SubscriberRequest;
import com.econetwireless.utils.messages.AirtimeTopupRequest;
import com.econetwireless.utils.pojo.INCreditResponse;


public class CreditsServiceImplTest {

	
	
	private CreditsServiceImpl creditsService;
	
	@Mock
	ChargingPlatform chargingPlatform;
	
	@Mock
    SubscriberRequestDao subscriberRequestDao;
	
	@Mock
	SubscriberRequest subscriberRequest;
	
	@Mock
	INCreditResponse inCreditResponse;
	
	@Mock
	AirtimeTopupRequest airtimeTopupRequest;

	private String partnerCode;
	
	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);		
		creditsService=new CreditsServiceImpl(chargingPlatform, subscriberRequestDao);
		partnerCode="hot-recharge";
		
	}

	@Test(expected=Exception.class)
	public void testCreditMethod() {
		final AirtimeTopupRequest airtimeTopupRequest = new AirtimeTopupRequest();
        airtimeTopupRequest.setPartnerCode(partnerCode);
        airtimeTopupRequest.setReferenceNumber("TOPUP-REF-9999");
        airtimeTopupRequest.setAmount(2.12);
        airtimeTopupRequest.setMsisdn("778087468");
		creditsService.credit(airtimeTopupRequest);
		
	}
	

}
