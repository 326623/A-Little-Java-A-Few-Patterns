package com.personal.aljfp.come_to_our_carousel.pizza;

public class Cheese extends Pizza {
    Pizza p;
    public Cheese(Pizza _p) {
        p = _p;
        printType();
    }

    public Pizza remA() {
        return remFn.forCheese(p);
    }

    public Pizza topAwC() {
        return topFn.forCheese(p);
    }

    public Pizza subAbC() {
        return subFn.forCheese(p);
    }
}
