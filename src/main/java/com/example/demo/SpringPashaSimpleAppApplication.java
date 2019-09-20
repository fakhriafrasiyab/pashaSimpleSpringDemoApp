package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringPashaSimpleAppApplication {

    public static void main(String[] args) {
       ConfigurableApplicationContext context = SpringApplication.run(SpringPashaSimpleAppApplication.class, args);
        Alien alien  = context.getBean(Alien.class);
        alien.show();
//        Alien alien1  = context.getBean(Alien.class);
//        alien.show();
//
//        Alien2 alien2  = context.getBean(Alien2.class);
//        alien2.show();
//
//        Alien2 alien2a  = context.getBean(Alien2.class);
//        alien2a.show();

    }

}
