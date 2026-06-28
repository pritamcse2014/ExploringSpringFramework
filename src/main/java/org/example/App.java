package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien alien1 = context.getBean("alien",  Alien.class);
        System.out.println(alien1.getAge());
        alien1.code();

//        Desktop desktop = context.getBean("computer2", Desktop.class);
        Desktop desktop = context.getBean(Desktop.class);
        Computer computer = context.getBean(Computer.class);
    }
}
