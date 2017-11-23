package com.vankeytech.pmp.common;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

@SpringBootApplication
@MapperScan(basePackages = "com.vankeytech.pmp.common.mapper")
@ImportResource("classpath:dubbo-provider.xml")
public class CommonApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(CommonApplication.class, args);
		System.in.read();
	}
}
