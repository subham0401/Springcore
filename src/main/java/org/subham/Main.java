package org.subham;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.subham.config.Appconfig;

/**
 * This is a simple demonstration of how to use Spring Framework's IoC (Inversion of Control) container.
 * <p>
 * Steps covered:
 * 1. Creating an ApplicationContext (IoC container)
 * 2. Loading the Spring configuration file (XML-based)
 * 3. Fetching a Bean (an instance managed by Spring) from the IoC container
 * 4. Calling a method on the retrieved Bean
 */
public class Main {
    public static void main(String[] args) {
        // Printing a message to indicate program execution
        System.out.println("******* Learning Spring Framework ***********");

        /*Java based configuration for IoC and DI*/

        ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
        Test test = context.getBean(Test.class);
        test.show1();
        Test test1 = context.getBean(Test.class);
        // test1.show();
        TestChild testChild = context.getBean(TestChild.class);

        HundaiAura hundaiAura = context.getBean(HundaiAura.class);
        //carInterface.drive();


       /*
       *  /*
        * Step 1: Creating an ApplicationContext object
        * -----------------------------------------------
        * - This initializes the Spring IoC (Inversion of Control) container.
        * - It reads the bean configuration from `application-context.xml`.
        * - It automatically manages object creation and dependency injection.
        *
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        /*
         * Step 2: Retrieving a Bean from IoC Container
         * ---------------------------------------------
         * - The getBean("beanId") method fetches the configured bean from the Spring container.
         * - We explicitly cast it to the correct class type (Test).
         *
        Test obj = (Test) context.getBean("test");
        Test obj1 = (Test) context.getBean("test");

        *
         * Step 3: Calling a Method on the Retrieved Bean
         * --------------------------`---------------------
         * - Once we have the bean instance, we can call its methods like a normal Java object.
         *
          obj.show();

        */
    }
}