package com.personal.aljfp.come_to_our_carousel.pizza;

public class TopAwC {

    public Pizza forAnchovy(Pizza p) {
        return new Cheese(
                new Anchovy(p.topAwC())
        );
    }

    public Pizza forCheese(Pizza p) {
        return new Cheese(p.topAwC());
    }

    public Pizza forCrust() {
        return new Crust();
    }

    public Pizza forOlive(Pizza p) {
        return new Olive(p.topAwC());
    }

    public Pizza forSausage(Pizza p) {
        return new Sausage(p.topAwC());
    }
}
