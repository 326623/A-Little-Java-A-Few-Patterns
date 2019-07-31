package com.personal.aljfp.boring_protocols.fish;

public class Tuna extends Fish {
    public Tuna() {printType();}

    public boolean equals(Object o) {
        return (o instanceof Tuna);
    }
}
