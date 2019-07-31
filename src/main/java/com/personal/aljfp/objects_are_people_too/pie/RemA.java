package com.personal.aljfp.objects_are_people_too.pie;


import com.personal.aljfp.objects_are_people_too.fish.Anchovy;

public class RemA {

    public Pie forBot() {
        return new Bot();
    }

    public Pie forTop(Object t, Pie r) {
        if(t instanceof Anchovy) {
            return r.remA();
        } else {
            return new Top(t, r.remA());
        }
    }
}
