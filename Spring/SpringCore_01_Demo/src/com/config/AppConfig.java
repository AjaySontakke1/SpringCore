package com.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan(basePackages = "com.Sbeans")
@Configuration
public class AppConfig {
	public AppConfig() {
		System.out.println("AppConfig.AppConfig() Zero Param Constructor");
		
	}
	@Bean
	public LocalDateTime createLDT(){
		System.out.println("AppConfig.createLDT() IOC container call");
		LocalDateTime ldt= LocalDateTime.now();
		return ldt;
		
	}
}
