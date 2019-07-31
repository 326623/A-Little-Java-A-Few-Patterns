package com.personal.aljfp.whats_new.pizza;

public class Cheese extends Pizza {
    Pizza p;
    public Cheese(Pizza _p) {
        p = _p;
        printType();
    }

    public Pizza remA() {
        return new Cheese(p.remA());
    }

    public Pizza topAwC() {
        return new Cheese(p.topAwC());
    }

    public Pizza subAbC() {
        return new Cheese(p.subAbC());
    }
}
