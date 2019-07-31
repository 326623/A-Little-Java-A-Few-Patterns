package com.personal.aljfp.objects_are_people_too.pie;

import com.personal.aljfp.objects_are_people_too.fish.Fish;

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
