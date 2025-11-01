package com.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Bean8 {
	public Bean8() {
		System.out.println("This is Bean 8");
	}
}
