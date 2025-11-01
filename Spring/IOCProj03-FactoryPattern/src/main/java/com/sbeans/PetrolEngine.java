package com.sbeans;

import org.springframework.stereotype.Component;

@Component(" petrolEngine")
public class PetrolEngine implements Engine{

	@Override
	public void StartEngine() {
		System.out.println("Starting Petrol Engine...Smoooth and Fast");	
	}

}
