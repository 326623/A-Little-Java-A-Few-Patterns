package com.personal.aljfp.objects_are_people_too.fish;

public class Tuna extends Fish {
    public Tuna() {printType();}

    public boolean equals(Object o) {
        return (o instanceof Tuna);
    }
}
