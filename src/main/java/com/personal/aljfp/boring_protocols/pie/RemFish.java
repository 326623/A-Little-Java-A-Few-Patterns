package com.personal.aljfp.boring_protocols.pie;

import com.personal.aljfp.boring_protocols.fish.Fish;

public class RemFish {
    Pie forBot(Fish f) {
        return new Bot();
    }

    Pie forTop(Object t, Pie r, Fish f) {
        if (f.equals(t)) {
            return r.remFish(f);
        }
        return new Top(t, r.remFish(f));
    }
}
