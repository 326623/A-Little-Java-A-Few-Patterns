package com.personal.aljfp.come_to_our_carousel.shish;

public class Tomato extends Shish {
    Shish s;
    public Tomato(Shish _s) {
        s = _s;
        printType();
    }

    public boolean onlyOnions() {
        return ooFn.forTomato(s);
    }

    public boolean isVegetarian() {
        return ivFn.forTomato(s);
    }
}
