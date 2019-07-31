package com.personal.aljfp.methods_to_our_madness.kebab;

public class Radish extends Kebab{

    Kebab k;
    public Radish(Kebab _k) {
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