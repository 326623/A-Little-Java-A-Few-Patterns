package com.personal.aljfp.whats_new.pizza;

public class Olive extends Pizza {
    Pizza p;
    public Olive(Pizza _p) {
        p = _p;
        printType();
    }

    public Pizza remA() {
        return new Olive(p.remA());
    }

    public Pizza topAwC() {
        return new Olive(p.topAwC());
    }

    public Pizza subAbC() {
        return new Olive(p.subAbC());
    }
}
