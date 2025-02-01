package org.subham;

import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
@Component
public class HundaiAura implements CarInterface{
    @Override
    public void drive() {
        System.out.println("I am driving Aura car and feeling very exited");
    }
}
