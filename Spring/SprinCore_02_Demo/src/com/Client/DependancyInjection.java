package com.Client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Config.AppConfig;
import com.Sbeans.GetSeason;

public class DependancyInjection {
public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	GetSeason GS= ctx.getBean(GetSeason.class);
	String season=GS.getseason();
	System.out.println("Season is"+season);
}
}
