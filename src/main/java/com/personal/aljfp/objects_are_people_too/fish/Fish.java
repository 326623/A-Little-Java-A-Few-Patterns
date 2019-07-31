package com.personal.aljfp.objects_are_people_too.fish;

public abstract class Fish {
    public void printType() {
        System.out.println("  |" + this.getClass().getSimpleName());
    }
}
