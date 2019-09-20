package com.example.demo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@Scope(value = "prototype")
public class Alien2 {
    private int id;
    private String name;
    private String tech;

    public void show() {
        System.out.println("alien2 show something");
    }

    public Alien2() {
        System.out.println("Alien 2 Object Created");
    }
}
