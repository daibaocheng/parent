package com.vankeytech.pmp.hms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

@SpringBootApplication
@EnableAutoConfiguration()
@ImportResource(locations = "classpath:dubbo-provider.xml")
//扫描dao层
@MapperScan(basePackages = "com.vankeytech.pmp.hms.mapper")
public class HmsApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(HmsApplication.class, args);
		//阻塞程序
		System.in.read();
	}
}
