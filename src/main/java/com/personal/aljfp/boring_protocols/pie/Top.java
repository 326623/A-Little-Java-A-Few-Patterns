package com.personal.aljfp.boring_protocols.pie;

import com.personal.aljfp.boring_protocols.fish.Fish;

public class Top extends Pie {

    Object t;
    Pie r;

    public Top(Object _t, Pie _r) {
        t = _t;
        r = _r;
        printType();
    }

    public Pie remA() {
        return raFn.forTop(t, r);
    }

    public Pie remFish(Fish f) {
        return rfFn.forTop(t, r, f);
    }

    public Pie rem(Object o) {
        return remFn.forTop(t, r, o);
    }

    public Pie subst(Object n, Object o) {
        return substFn.forTop(t, r, n, o);
    }
}
