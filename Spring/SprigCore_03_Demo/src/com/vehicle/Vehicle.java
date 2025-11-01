package com.vehicle;

import com.engine.Engine;

public class Vehicle {
	private Engine engine;

	public Vehicle(Engine engine) {
		this.setEngine(engine);
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public void Startengine() {
		System.out.println("Vehical ready to start");
		engine.StartEngine();
	}

	
}
