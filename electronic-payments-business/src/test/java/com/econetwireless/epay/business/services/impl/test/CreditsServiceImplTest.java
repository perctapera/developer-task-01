package com.econetwireless.epay.business.services.impl.test;


import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.exceptions.misusing.UnfinishedStubbingException;

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

	private String partnerCode = "hot-recharge";

	@Before
	public void initMocks() {
		MockitoAnnotations.initMocks(this);

		creditsService = new CreditsServiceImpl(chargingPlatform, subscriberRequestDao);

	}

	@Test(expected = UnfinishedStubbingException.class)
	public void testCredit() {
		final AirtimeTopupRequest airtimeTopupRequest = new AirtimeTopupRequest();
		airtimeTopupRequest.setAmount(5.80);
		airtimeTopupRequest.setMsisdn("778087468");
		airtimeTopupRequest.setPartnerCode(partnerCode);
		airtimeTopupRequest.setReferenceNumber("TOPUP-REF-9999");
		creditsService.credit(airtimeTopupRequest);

	}

	@Test
	public void test_changeSubscriberRequestStatusOnCredit() throws Exception {
		final AirtimeTopupRequest airtimeTopupRequest = new AirtimeTopupRequest();
		airtimeTopupRequest.setAmount(5.80);
		airtimeTopupRequest.setMsisdn("778087468");
		airtimeTopupRequest.setPartnerCode(partnerCode);
		airtimeTopupRequest.setReferenceNumber("TOPUP-REF-9999");
		subscriberRequest = new SubscriberRequest();
		inCreditResponse = new INCreditResponse();


	}
}