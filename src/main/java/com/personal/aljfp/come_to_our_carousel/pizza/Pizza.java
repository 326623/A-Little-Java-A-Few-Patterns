package com.personal.aljfp.come_to_our_carousel.pizza;

public abstract class Pizza {
    RemA remFn = new RemA();
    TopAwC topFn = new TopAwC();
    SubAbC subFn = new SubAbC();

    public abstract Pizza remA();
    public abstract Pizza topAwC();
    public abstract Pizza subAbC();

    public void printType() {
        System.out.println("  |" + this.getClass().getSimpleName());
    }
}
