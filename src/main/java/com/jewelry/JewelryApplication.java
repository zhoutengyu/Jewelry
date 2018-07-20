package com.jewelry;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@MapperScan("com/jewelry/mapper")

public class JewelryApplication {

	public static void main(String[] args) {
		SpringApplication.run(JewelryApplication.class, args);
	}
}
