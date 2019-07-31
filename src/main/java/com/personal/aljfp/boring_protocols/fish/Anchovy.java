package com.personal.aljfp.boring_protocols.fish;

public class Anchovy extends Fish {
    public Anchovy() {printType();}

    public boolean equals(Object o) {
        return (o instanceof Anchovy);
    }
}
