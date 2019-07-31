package com.personal.aljfp.whats_new.pizza;

public class Spinach extends Pizza {

    Pizza p;
    Spinach(Pizza _p) {
        p = _p;
        printType();
    }

    public Pizza remA() {
        return new Spinach(p.remA());
    }

    public Pizza topAwC() {
        return new Spinach(p.topAwC());
    }

    public Pizza subAbC() {
        return new Spinach(p.subAbC());
    }
}
