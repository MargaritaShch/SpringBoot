package com.example.myproject.config;

import com.example.myproject.components.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Wheel wheel() {
        return new Wheel();
    }

    @Bean
    public Starter starter() {
        return new Starter();
    }

    @Bean
    public SparkPlug sparkPlug() {
        return new SparkPlug();
    }

    @Bean
    public Accumulator accumulator() {
        return new Accumulator();
    }

    @Bean
    public Hinge hinge() {
        return new Hinge();
    }

    @Bean
    public Differential differential() {
        return new Differential();
    }

    @Bean
    public Engine engine() {
        return new Engine(starter(), sparkPlug());
    }

    @Bean
    public Suspension suspension() {
        return new Suspension(hinge());
    }

    @Bean
    public Car car() {
        return new Car(wheel(), engine(), accumulator(), suspension(), differential());
    }
}
