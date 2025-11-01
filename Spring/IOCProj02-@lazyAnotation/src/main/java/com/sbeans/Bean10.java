package com.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Bean10 {
	public Bean10() {
		System.out.println("This is Bean 10");
	}
}