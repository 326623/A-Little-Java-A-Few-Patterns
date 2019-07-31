package com.personal.aljfp.whats_new.pizza;

public abstract class Pizza {

    public abstract Pizza remA();
    public abstract Pizza topAwC();
    abstract Pizza subAbC();

    public void printType() {
        System.out.println("  |" + this.getClass().getSimpleName());
    }

}
