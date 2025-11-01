package com.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Bean7 {
	public Bean7() {
		System.out.println("This is Bean 7");
	}
	
}
