package com.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Bean6 {

	public void  display() {
		System.out.println("This is Bean 6");
	}
}
