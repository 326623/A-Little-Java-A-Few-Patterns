package com.personal.aljfp.objects_are_people_too.pie;

import com.personal.aljfp.objects_are_people_too.fish.Fish;

public class Bot extends Pie {
    public Bot() {printType();}

    public Pie remA() {
        return raFn.forBot();
    }

    public Pie remFish(Fish f) {
        return rfFn.forBot(f);
    }

    public Pie rem(Object o) {
        return remFn.forBot(o);
    }

    public Pie subst(Object n, Object o) {
        return substFn.forBot(n, o);
    }

}
