package com.personal.aljfp.come_to_our_carousel.pizza;

public class Crust extends Pizza {

    public Crust() {
        printType();
    }

    public Pizza remA() {
        return remFn.forCrust();
    }

    public Pizza topAwC () {
        return topFn.forCrust();
    }

    public Pizza subAbC() {
        return subFn.forCrust();
    }
}
