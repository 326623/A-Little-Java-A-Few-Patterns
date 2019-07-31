package com.personal.aljfp.methods_to_our_madness.kebab;

public class Shrimp extends Kebab{

    Kebab k;
    Shrimp (Kebab _k) {
        k = _k;
        printClassType();
    }

    boolean isVeggie() {
        return false;
    }

    Object whatHolder() {
        return k.whatHolder();
    }
}
