package com.a2z;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.config.AppConfig;
import com.sbeans.Bean6;
import com.sbeans.Bean7;
import com.sbeans.Bean8;

public class App {
    public static void main(String[] args) {
        System.out.println("------------------Pre instantiate bean--------------");
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("------------Requesting Bean 6----------------");
        Bean6 g = ctx.getBean(Bean6.class);
        g.display();

        System.out.println("------------Requesting Bean 7----------------");
        Bean7 b7 = ctx.getBean(Bean7.class); // create lazy bean
        System.out.println("Bean7 successfully retrieved!");
          
        Bean8 b8=ctx.getBean(Bean8.class);
        ctx.close();
        
    }
}
