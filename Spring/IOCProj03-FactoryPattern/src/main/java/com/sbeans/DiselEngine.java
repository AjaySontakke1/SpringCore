package com.sbeans;

import org.springframework.stereotype.Component;

@Component("diselEngine")
public class DiselEngine implements Engine {

	@Override
	public void StartEngine() {
		System.out.println("Starting Disel Engine...Strong Power");
		
	}


	

}
