package com.personal.aljfp.methods_to_our_madness.shish;

import com.personal.aljfp.methods_to_our_madness.shish.Shish;

public class Onion extends Shish {

    Shish s;
    public Onion(Shish _s) {
        s = _s;
        printClassType();
    }

    public boolean onlyOnions() { return s.onlyOnions(); }

    public boolean isVegetarian() {
        return s.isVegetarian();
    }
}
