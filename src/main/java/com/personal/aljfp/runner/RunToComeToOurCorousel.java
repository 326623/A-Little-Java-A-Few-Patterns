package com.personal.aljfp.runner;

import com.personal.aljfp.come_to_our_carousel.pizza.*;
import com.personal.aljfp.come_to_our_carousel.shish.*;

public class RunToComeToOurCorousel {

    public static void runComeToOurCorousel() {

        System.out.println("========== Run come to our corousel ==========");

        Shish s1 = new Onion(
                new Onion(
                        new Skewer()
                )
        );
        System.out.println(s1.getClass().getSuperclass().getSimpleName() + "\n\n");
        System.out.println("Contains only onions : " + s1.onlyOnions());

        Shish s2 = new Onion(
                new Tomato(
                        new Skewer()
                )
        );
        System.out.println(s2.getClass().getSuperclass().getSimpleName() + "\n\n");
        System.out.println("Contains only onions : " + s2.onlyOnions());


        Shish s3 = new Onion(
                new Lamb(
                        new Tomato(
                                new Skewer()
                        )
                )
        );
        System.out.println(s3.getClass().getSuperclass().getSimpleName() + "\n\n");
        System.out.println("is veg : " + s3.isVegetarian());

        Shish s4 = new Onion(
                new Tomato(
                        new Tomato(
                                new Skewer()
                        )
                )
        );
        System.out.println(s4.getClass().getSuperclass().getSimpleName() + "\n\n");
        System.out.println("is  veg : " + s4.isVegetarian());


        ///More visitor
        System.out.println("A new Pizza");
        Pizza p1 = new Anchovy(
                new Anchovy(
                        new Cheese(
                                new Olive(
                                        new Sausage(
                                                new Crust()
                                        )
                                )
                        )
                ));
        System.out.println(p1.getClass().getSuperclass().getSimpleName() + "\n\n");
        System.out.println("Removing Anchovies");
        Pizza p2 = p1.remA();
        System.out.println(p2.getClass().getSuperclass().getSimpleName() + "\n\n");

        System.out.println("Top anchovies with cheese");
        Pizza p3 = p1.topAwC();
        System.out.println(p3.getClass().getSuperclass().getSimpleName() + "\n\n");

        System.out.println("Substitute anchovies by cheese");
        Pizza p4 = p3.subAbC();
        System.out.println(p4.getClass().getSuperclass().getSimpleName() + "\n\n");


        System.out.println("========== End come to our corousel ==========");
    }
}
