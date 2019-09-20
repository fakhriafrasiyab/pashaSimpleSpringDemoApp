package com.example.demo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Laptop {
    private int laptopId;
    private String brand;

    public void compile() {
        System.out.println("compiling");
    }
}
