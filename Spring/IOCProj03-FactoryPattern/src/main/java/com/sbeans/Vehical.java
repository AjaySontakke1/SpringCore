package com.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Vehical {
	@Autowired
	@Qualifier("diselEngine")
	private Engine engine;
	
//	public Vehical(Engine engine) {
//		this.engine = engine;
//	}

	public void setengine(Engine engine) {
		this.engine = engine;
	}

	public void startvehical() {
		System.out.println("Vehical Started");
		engine.StartEngine();
	}
}
