package org.subham.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.subham.Test;
import org.subham.TestChild;

import java.security.PublicKey;

@Configuration
@ComponentScan("org.subham")
public class Appconfig {
//    @Bean
// // @Scope(value = "prototype") // by this new object will create every time when required.
//    public Test test ( TestChild testChild){
//       Test test = new Test();
//       test.setTestChild(testChild);
//       return test;
//    }
//
//    @Bean
//    public TestChild testChild(){
//        return new TestChild();
//    }
}
