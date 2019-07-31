package com.personal.aljfp.whats_new.pizza;

public class Anchovy extends Pizza {

    Pizza p;
    public Anchovy(Pizza _p) {
        p = _p;
        printType();
    }

    public Pizza remA() {
        return p.remA();
    }

    public Pizza topAwC() {
        return new Cheese(
                new Anchovy(p.topAwC()));
    }

    public Pizza subAbC() {
        return new Cheese(p.subAbC());
    }
}
