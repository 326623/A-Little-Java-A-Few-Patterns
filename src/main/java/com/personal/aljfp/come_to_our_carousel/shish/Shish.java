package com.personal.aljfp.come_to_our_carousel.shish;

public abstract class Shish {
    OnlyOnions ooFn = new OnlyOnions();
    IsVegetarian ivFn = new IsVegetarian();
    public abstract boolean onlyOnions();
    public abstract boolean isVegetarian();

    public void printType() {
        System.out.println("  |" + this.getClass().getSimpleName());
    }
}
