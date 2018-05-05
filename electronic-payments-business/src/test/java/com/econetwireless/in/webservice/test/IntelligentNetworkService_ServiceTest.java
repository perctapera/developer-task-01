package java.com.econetwireless.in.webservice.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import com.econetwireless.in.webservice.IntelligentNetworkService_Service;

public class IntelligentNetworkService_ServiceTest {

	IntelligentNetworkService_Service service;
	private Class serviceEndpointInterface;
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		service=new IntelligentNetworkService_Service();
	}

}
