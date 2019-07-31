package com.personal.aljfp.objects_are_people_too.fish;

public class Salmon extends Fish {
    Salmon() {
        printType();
    }

    public boolean equals(Object o) {
        return (o instanceof Salmon);
    }
}
