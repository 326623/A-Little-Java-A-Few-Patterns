package com.personal.aljfp.methods_to_our_madness.kebab;

public abstract class Kebab {
    abstract boolean isVeggie();
    abstract Object whatHolder();

    public String toString() {
        return "  |" + this.getClass().getSimpleName();
    }

    public void printClassType() {
        System.out.println(toString());
    }
}
