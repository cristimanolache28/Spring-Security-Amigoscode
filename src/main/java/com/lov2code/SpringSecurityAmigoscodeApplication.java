package com.lov2code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringSecurityAmigoscodeApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringSecurityAmigoscodeApplication.class, args);
//        for (String s : context.getBeanDefinitionNames()) {
//            System.out.println(s);
        }

}
