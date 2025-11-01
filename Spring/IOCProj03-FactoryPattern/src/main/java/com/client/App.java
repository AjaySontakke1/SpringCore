package com.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.sbeans.PetrolEngine;
import com.sbeans.Vehical;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    	Vehical car=ctx.getBean(Vehical.class);
    	car.startvehical();
    	car.setengine(new PetrolEngine());
    	car.startvehical();
    }
}
