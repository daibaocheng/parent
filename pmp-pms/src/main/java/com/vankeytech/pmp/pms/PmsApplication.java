package com.vankeytech.pmp.pms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.vankeytech.pmp.pms.mapper")
//@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
//@ImportResource(locations = "classpath:dubbo-consumer.xml")
public class PmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PmsApplication.class, args);
	}
}
