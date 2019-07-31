package com.personal.aljfp.come_to_our_carousel.pizza;

public class Anchovy extends Pizza {
    Pizza p;
    public Anchovy(Pizza _p) {
        p = _p;
        printType();
    }

    public Pizza remA() {
        return remFn.forAnchovy(p);
    }

    public Pizza topAwC() {
        return topFn.forAnchovy(p);
    }

    public Pizza subAbC() {
        return subFn.forAnchovy(p);
    }


}
