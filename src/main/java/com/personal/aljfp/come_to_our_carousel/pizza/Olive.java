package com.personal.aljfp.come_to_our_carousel.pizza;

public class Olive extends Pizza {
    Pizza p;
    public Olive(Pizza _p) {
        p = _p;
        printType();
    }

    public Pizza remA() {
        return remFn.forOlive(p);
    }

    public Pizza topAwC() {
        return topFn.forOlive(p);
    }

    public Pizza subAbC() {
        return subFn.forOlive(p);
    }
}
