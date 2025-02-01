package org.subham;

import org.springframework.stereotype.Component;

@Component
public class TestChild {

    public TestChild(){
        System.out.println("Test child object is created well");
    }
    public int sum ;

    public void show1(){
        System.out.println("I am in show of testChild");
    }
}
