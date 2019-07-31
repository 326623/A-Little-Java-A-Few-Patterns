package com.personal.aljfp.objects_are_people_too.fish;

public class Anchovy extends Fish {
    public Anchovy() {printType();}

    public boolean equals(Object o) {
        return (o instanceof Anchovy);
    }
}
