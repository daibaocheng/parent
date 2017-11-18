package com.vankeytech.pmp.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xieliang
 */
@SpringBootApplication
@MapperScan(basePackages = "com.vankeytech.pmp.auth.mapper")
public class AuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthApplication.class, args);
	}
}
