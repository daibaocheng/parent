package com.vankeytech.pmp.ams;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
@SpringBootTest
public class AmsApplicationTests {

	@Test
	public void contextLoads() {
	}

}
