package com.personal.aljfp.come_to_our_carousel.shish;

public class IsVegetarian {

    public boolean forLamb(Shish s) {
        return false;
    }

    public boolean forOnion(Shish s) {
        return s.isVegetarian();
    }

    public boolean forSkewer() {
        return true;
    }

    public boolean forTomato(Shish s) {
        return s.isVegetarian();
    }


}
