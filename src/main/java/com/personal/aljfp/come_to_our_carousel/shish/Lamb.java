package com.personal.aljfp.come_to_our_carousel.shish;

public class Lamb extends Shish {
    Shish s;
    public Lamb(Shish _s) {
        s = _s;
        printType();
    }

    public boolean onlyOnions() {
        return ooFn.forLamb(s);
    }

    public boolean isVegetarian() {
        return ivFn.forLamb(s);
    }
}
