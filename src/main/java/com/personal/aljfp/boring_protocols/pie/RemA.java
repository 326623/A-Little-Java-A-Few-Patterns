package com.personal.aljfp.boring_protocols.pie;


import com.personal.aljfp.boring_protocols.fish.Anchovy;

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
