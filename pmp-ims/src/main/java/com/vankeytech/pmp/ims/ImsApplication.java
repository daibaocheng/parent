package com.vankeytech.pmp.ims;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

/**
 * @author AlexWong
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
@ImportResource(locations = "classpath:dubbo-provider.xml")
public class ImsApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(ImsApplication.class, args);
		System.in.read();
	}
}
