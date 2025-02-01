package org.subham;

import org.springframework.stereotype.Component;

@Component
public class Suzuki implements CarInterface{
    @Override
    public void drive() {
        System.out.println("I am driving SUZUKI 800 and feeling nice");
    }
}
