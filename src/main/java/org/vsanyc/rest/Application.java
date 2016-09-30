package org.vsanyc.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        System.out.println("Simple rest client is started");
        System.out.println("Bean definition count: " + ctx.getBeanDefinitionCount());

        System.out.println("Bean names: ");

        String[] beans = ctx.getBeanDefinitionNames();
        for(String bean : beans) {
            System.out.println(bean);
        }
    }
}
