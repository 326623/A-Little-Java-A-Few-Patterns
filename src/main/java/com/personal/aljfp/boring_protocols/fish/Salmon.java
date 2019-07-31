package com.personal.aljfp.boring_protocols.fish;

public class Salmon extends Fish {
    Salmon() {
        printType();
    }

    public boolean equals(Object o) {
        return (o instanceof Salmon);
    }
}
