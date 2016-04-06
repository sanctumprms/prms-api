package org.rvsystem.hms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@WebIntegrationTest
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = HotelManagementSoftwareApplication.class)
public class HotelManagementSoftwareApplicationTests {

	@Test
	public void contextLoads() {
	}

}
