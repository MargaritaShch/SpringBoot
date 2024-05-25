package com.example.myproject.components;

import org.springframework.stereotype.Component;

public class Car {
    private Wheel wheel;
    private Engine engine;
    private Accumulator accumulator;
    private Suspension suspension;
    private Differential differential;

    public Car(Wheel wheel, Engine engine, Accumulator accumulator, Suspension suspension, Differential differential) {
        this.wheel = wheel;
        this.engine = engine;
        this.accumulator = accumulator;
        this.suspension = suspension;
        this.differential = differential;
    }

    @Override
    public String toString() {
        return "Car [wheel=" + wheel + ", engine=" + engine + ", accumulator=" + accumulator + ", suspension=" + suspension + ", differential=" + differential + "]";
    }
}
