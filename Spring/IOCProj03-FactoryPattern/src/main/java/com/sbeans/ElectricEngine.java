package com.sbeans;

import org.springframework.stereotype.Component;

@Component("electricEngine")
public class ElectricEngine implements Engine {
	@Override
	public void StartEngine() {
		System.out.println("Starting Electric Engine......Scilent And Eco-Friendly");
	}

}
