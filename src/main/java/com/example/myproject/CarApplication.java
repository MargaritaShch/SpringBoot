package com.example.myproject;

import com.example.myproject.components.*;
import com.example.myproject.config.AppConfig;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CarApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CarApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
           // XML
        ApplicationContext contextXml = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car carXml = (Car) contextXml.getBean("car");
        System.out.println("Car from XML: " + carXml);

        // XML + Java Annotation
        ApplicationContext contextAnnotation = new ClassPathXmlApplicationContext("applicationContext-annotation.xml");
        Car carAnnotation = contextAnnotation.getBean(Car.class);
        System.out.println("Car from Annotation: " + carAnnotation);

        // Java Code
        ApplicationContext contextJavaCode = new AnnotationConfigApplicationContext(AppConfig.class);
        Car carJavaCode = contextJavaCode.getBean(Car.class);
        System.out.println("Car from Java Code: " + carJavaCode);
    }
}
