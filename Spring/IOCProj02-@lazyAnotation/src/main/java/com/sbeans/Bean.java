package com.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Bean {
	public Bean() {
		System.out.println("This is Bean 1");
	}
}

@Component
class Bean2 {
	public Bean2() {
		System.out.println("This is Bean 2");
	}
}

@Component
class Bean3 {
	public Bean3() {
		System.out.println("This is Bean 3");
	}
}

@Component
class Bean4 {
	public Bean4() {
		System.out.println("This is Bean 4");
	}
}

@Component
class Bean5 {
	public Bean5() {
		System.out.println("This is Bean 5");
	}
}