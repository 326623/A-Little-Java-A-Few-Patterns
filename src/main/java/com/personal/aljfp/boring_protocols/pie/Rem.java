package com.personal.aljfp.boring_protocols.pie;

public class Rem {
    Pie forBot(Object o) {
        return new Bot();
    }

    Pie forTop(Object t, Pie r, Object o) {
        if(o.equals(t)) {
            return r.rem(o);
        } else {
            return new Top(t, r.rem(o));
        }
    }
}
