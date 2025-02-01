package org.subham;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.Socket;
@Component
public class Test {

    public Test (){

        System.out.println("Test object is created");
    }
    ///@Autowired
   private TestChild testChild; // this is field DI

    @Autowired// this is setter DI
    public void setTestChild(TestChild testChild) {
        this.testChild = testChild;
    }

    public TestChild getTestChild() {
        return testChild;
    }

    public void show1(){
        System.out.println("value of sum = "+testChild.sum);
    }
    public void show(){
        System.out.println("I am doing coding ");
    }





}
