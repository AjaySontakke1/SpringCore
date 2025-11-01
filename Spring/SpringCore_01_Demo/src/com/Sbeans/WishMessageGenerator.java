package com.Sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WishMessageGenerator {
	@Autowired
	private LocalDateTime ldt;
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
	}
	public String showWishmessage(String name) {
		int hour=ldt.getHour();
		if(hour<12) {
			return "Good Morning:"+name;
		}else if(hour<16) {
			return "Good Afternoon:"+name;
		}else {
			return "Good Night"+name;
		}
		
	}
}
