package com.example.demo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Alien {
    private int id;
    private String name;
    private String tech;
    @Autowired
    private Laptop laptop;

    public void show() {
        System.out.println("alien show something");
        laptop.compile();
    }
    public Alien() {
        System.out.println("Alien Object Created");
    }
}
