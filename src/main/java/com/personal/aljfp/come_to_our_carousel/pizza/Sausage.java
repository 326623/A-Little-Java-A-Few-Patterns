package com.personal.aljfp.come_to_our_carousel.pizza;

public class Sausage extends Pizza {
    Pizza p;
    public Sausage(Pizza _p) {
        p = _p;
        printType();
    }

    public Pizza remA() {
        return remFn.forSausage(p);
    }

    public Pizza topAwC() {
        return topFn.forSausage(p);
    }

    public Pizza subAbC() {
        return subFn.forSausage(p);
    }
}
