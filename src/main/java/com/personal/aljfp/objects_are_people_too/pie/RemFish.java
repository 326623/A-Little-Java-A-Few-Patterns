package com.personal.aljfp.objects_are_people_too.pie;

import com.personal.aljfp.objects_are_people_too.fish.Fish;

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
