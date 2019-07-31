package com.personal.aljfp.come_to_our_carousel.pizza;

public class SubAbC {

    public Pizza forAnchovy(Pizza p) {
        return new Cheese(p.subAbC());
    }

    public Pizza forCheese(Pizza p) {
        return new Cheese(p.subAbC());
    }

    public Pizza forCrust() {
        return new Crust();
    }

    public Pizza forOlive(Pizza p) {
        return new Olive(p.subAbC());
    }

    public Pizza forSausage(Pizza p) {
        return new Sausage(p.subAbC());
    }
}
