package com.personal.aljfp.come_to_our_carousel.shish;

public class Onion extends Shish {

    Shish s;
    public Onion(Shish _s) {
        s = _s;
        printType();
    }

    public boolean onlyOnions() {
        return ooFn.forOnion(s);
    }

    public boolean isVegetarian() {
        return ivFn.forOnion(s);
    }
}
