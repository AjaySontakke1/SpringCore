package com.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Bean9 {
	public Bean9() {
		System.out.println("This is Bean 9");
	}
}
