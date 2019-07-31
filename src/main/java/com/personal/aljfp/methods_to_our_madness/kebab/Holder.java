package com.personal.aljfp.methods_to_our_madness.kebab;

public class Holder extends Kebab {

    Object o;
    public Holder(Object _o) {
        o = _o;
        printClassType();
    }

    boolean isVeggie() {
        return true;
    }

    Object whatHolder() {
        return o;
    }
}
