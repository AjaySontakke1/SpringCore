package com.Config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.Sbeans")
public class AppConfig {
	@Bean
	public LocalDateTime CreateLDT() {
		LocalDateTime ldt=LocalDateTime.now();
		return ldt;
	}

}
