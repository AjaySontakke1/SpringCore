package com.client;
import com.engine.Engine;
import com.engine.DiselEngine;
import com.engine.ElectricEngine;
import com.engine.PetrolEngine;
import com.vehicle.Vehicle;

public class Main {
	public static void main(String[] args) {
      Vehicle car=new Vehicle(new PetrolEngine());
      car.Startengine();

       car.setEngine(new ElectricEngine());
       car.Startengine();
		
		
		Engine engine=new DiselEngine();
		Vehicle car1 =new Vehicle(engine);
		car1.Startengine();
	}
}
