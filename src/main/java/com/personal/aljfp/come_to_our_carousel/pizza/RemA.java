package com.personal.aljfp.come_to_our_carousel.pizza;

public class RemA {

    public Pizza forAnchovy(Pizza p) {
        return p.remA();
    }

    public Pizza forCheese(Pizza p) {
        return new Cheese(p.remA());
    }

    public Pizza forCrust() {
        return new Crust();
    }

    public Pizza forOlive(Pizza p) {
        return new Olive(p.remA());
    }

    public Pizza forSausage(Pizza p) {
        return new Sausage(p.remA());
    }

}
