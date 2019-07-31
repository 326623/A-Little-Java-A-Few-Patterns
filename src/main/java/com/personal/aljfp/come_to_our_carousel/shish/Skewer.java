package com.personal.aljfp.come_to_our_carousel.shish;

public class Skewer extends Shish {

    public Skewer() {
        printType();
    }

    public boolean onlyOnions() {
        return ooFn.forSkewer();
    }

    public boolean isVegetarian() {
        return ivFn.forSkewer();
    }

}
