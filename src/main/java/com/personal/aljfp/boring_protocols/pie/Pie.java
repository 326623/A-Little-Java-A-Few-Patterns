package com.personal.aljfp.boring_protocols.pie;

import com.personal.aljfp.boring_protocols.fish.Fish;

public abstract class Pie {
    RemA raFn = new RemA();
    RemFish rfFn = new RemFish();
    Rem remFn = new Rem();
    Subst substFn = new Subst();
    public abstract Pie subst(Object n, Object o);
    public abstract Pie rem(Object o);
    public abstract Pie remFish(Fish f);
    public abstract Pie remA();
    public void printType() {
        System.out.println("  |" + this.getClass().getSimpleName());
    }
}
