package com.personal.aljfp.methods_to_our_madness.kebab;

public class Zucchini extends Kebab {
    Kebab k;
    Zucchini(Kebab _k) {
        k = _k;
        printClassType();
    }

    boolean isVeggie() {
        return k.isVeggie();
    }


    Object whatHolder() {
        return k.whatHolder();
    }
}
