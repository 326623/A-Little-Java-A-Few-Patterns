package com.personal.aljfp.come_to_our_carousel.shish;

public class OnlyOnions {

    public boolean forSkewer() {
        return true;
    }

    public boolean forOnion(Shish s) {
        return s.onlyOnions();
    }

    public boolean forLamb(Shish s) {
        return false;
    }

    public boolean forTomato(Shish s) {
        return false;
    }
}
