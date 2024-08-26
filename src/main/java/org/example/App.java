package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Pet pet = (Pet) context.getBean("pet");
//        System.out.println(pet.getCat());
        pet.manage();
    }
}
