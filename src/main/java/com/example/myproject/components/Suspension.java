package com.example.myproject.components;

import org.springframework.stereotype.Component;

public class Suspension {
    private Hinge hinge;

    public Suspension(Hinge hinge) {
        this.hinge = hinge;
    }

    @Override
    public String toString() {
        return "Suspension [hinge=" + hinge + "]";
    }
}
