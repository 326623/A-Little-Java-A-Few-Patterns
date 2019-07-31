package com.personal.aljfp.methods_to_our_madness.kebab;

public class Shallot extends Kebab{

    Kebab k;
    public Shallot(Kebab _k) {
        k = _k;
        printClassType();
    }

    public boolean isVeggie() {
        return k.isVeggie();
    }

    Object whatHolder() {
        return k.whatHolder();
    }
}
