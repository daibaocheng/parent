package com.vankeytech.pmp.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author xieliang
 */
@SpringBootApplication
@EnableTransactionManagement   //开启注解
@MapperScan(basePackages = "com.vankeytech.pmp.auth.mapper")
public class AuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthApplication.class, args);
	}
}
