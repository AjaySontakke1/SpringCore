package com.Client;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.*;

import com.Sbeans.WishMessageGenerator;
import com.config.AppConfig;

public class DependancyInjection {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
			Scanner sc = new Scanner(System.in);
			WishMessageGenerator ws = ctx.getBean(WishMessageGenerator.class);
			System.out.println("Enter the username");
			String name = sc.nextLine();
			String msg = ws.showWishmessage(name);
			System.out.println("Result is:" + msg);
		} catch (BeansException e) {

			e.printStackTrace();
		}
	}
}
