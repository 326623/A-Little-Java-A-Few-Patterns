package com.personal.aljfp.boring_protocols.fish;

public abstract class Fish {
    public void printType() {
        System.out.println("  |" + this.getClass().getSimpleName());
    }
}
