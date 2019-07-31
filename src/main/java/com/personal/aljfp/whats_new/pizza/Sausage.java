package com.personal.aljfp.whats_new.pizza;

public class Sausage extends Pizza{
    Pizza p;
    public Sausage(Pizza _p) {
        p = _p;
        printType();
    }

    public Pizza remA() {
        return new Sausage(p.remA());
    }

    public Pizza topAwC() {
        return new Sausage(p.topAwC());
    }

    public Pizza subAbC() {
        return new Sausage(p.subAbC());
    }
}
