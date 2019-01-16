package com.sunym;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@MapperScan("com.sunym.dao")
@SpringBootApplication
public class MyProjectApplication {
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(MyProjectApplication.class);
		application.run(args);
	}
}
