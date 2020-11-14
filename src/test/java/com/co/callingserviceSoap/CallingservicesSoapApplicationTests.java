package com.co.callingserviceSoap;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import wcompensar.caf.Afiliado;
import wcompensar.caf.AfiliadoResponse;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ContextConfiguration(classes = ConfigurationHello.class, loader = AnnotationConfigContextLoader.class)
@TestPropertySource("/application.properties")
class CallingservicesSoapApplicationTests {

	@Autowired
	private SOAPConnectClient client;

	@Value("${WSDL.SOAPClient}")
	private String clientEndPoint;

	private Jaxb2Marshaller marshaller = new Jaxb2Marshaller();

	@Before
	public void init() throws Exception {
		marshaller.setPackagesToScan("wcompensar.caf");
		marshaller.afterPropertiesSet();
	}
	
//	@Test
//	void contextLoads() {
//		
//		Afiliado request = new Afiliado();
//		request.setDIdentificacion("39546050"); 
//		AfiliadoResponse response = (AfiliadoResponse) client.
//				callWebServices(clientEndPoint, request);
//		assertEquals(true, response.getAfiliadoResult().length()>0);
//		
//	}

}
