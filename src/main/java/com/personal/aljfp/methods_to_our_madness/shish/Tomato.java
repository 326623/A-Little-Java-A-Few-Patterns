package com.personal.aljfp.methods_to_our_madness.shish;

import com.personal.aljfp.methods_to_our_madness.shish.Shish;

public class Tomato extends Shish {
    Shish s;
    Tomato(Shish _s) {
        s = _s;
        printClassType();
    }

    boolean onlyOnions() {
        return false;
    }

    boolean isVegetarian() {
        return s.isVegetarian();
    }
}
