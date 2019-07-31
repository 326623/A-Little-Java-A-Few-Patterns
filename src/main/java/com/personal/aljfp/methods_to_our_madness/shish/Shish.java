package com.personal.aljfp.methods_to_our_madness.shish;

public abstract class Shish {
    abstract boolean onlyOnions();
    abstract boolean isVegetarian();

    public String toString() {
        return "  |" + this.getClass().getSimpleName();
    }

    public void printClassType() {
        System.out.println(toString());
    }
}
