package com.personal.aljfp.runner;

import com.personal.aljfp.whats_new.pizza.*;

public class RunWhatsNew {

    public static void runWhatsNew() {


        System.out.println("========== Run what's new ==========");
        Pizza p = new Anchovy(
                new Olive(
                        new Anchovy(
                                new Anchovy(
                                        new Cheese(
                                                new Crust()
                                        )
                                )
                        )
                )
        );
        System.out.println(p.getClass().getSuperclass().getSimpleName() + "\n\n");
        System.out.println("Removing Anchovies...");
        Object o = p.remA();
        System.out.println(o.getClass().getSuperclass().getSimpleName() + "\n\n");


        System.out.println("A new pizza");
        Pizza p1 = new Anchovy(
                new Olive(
                        new Anchovy(
                                new Anchovy(
                                        new Cheese(
                                                new Crust()
                                        )
                                )
                        )
                )
        );
        System.out.println(p1.getClass().getSuperclass().getSimpleName() + "\n\n");
        System.out.println("Removing more anchovies ...");
        Object o1 = p1.remA();
        System.out.println(o1.getClass().getSuperclass().getSimpleName() + "\n\n");

        System.out.println("A new pizza");
        Pizza p3 = new Sausage(
                new Olive(
                        new Anchovy(
                                new Sausage(
                                        new Cheese(
                                                new Crust()
                                        )
                                )
                        )
                )
        );
        System.out.println(p3.getClass().getSuperclass().getSimpleName() + "\n\n");
        System.out.println("Removing anchovies");
        Object o3 = p3.remA();
        System.out.println(o3.getClass().getSuperclass().getSimpleName() + "\n\n");


        System.out.println("A new Pizza");
        Pizza p4 = new Anchovy(
                new Anchovy(
                        new Crust()
                )
        );
        System.out.println(p4.getClass().getSuperclass().getSimpleName() + "\n\n");
        System.out.println("Removing anchovies");
        Object o4 = p4.remA();
        System.out.println(o4.getClass().getSuperclass().getSimpleName() + "\n\n");

        ////More madness

        System.out.println("Let's work on the toppings part");
        Pizza p5 = new Olive(
                new Anchovy(
                        new Cheese(
                                new Anchovy(
                                        new Crust()
                                )
                        )
                )
        );
        System.out.println(p5.getClass().getSuperclass().getSimpleName() + "\n\n");
        System.out.println("Adding Cheese");
        Object o5 = p5.topAwC();
        System.out.println(o5.getClass().getSuperclass().getSimpleName() + "\n\n");

        //Remove anchovies
        Object oR = ((Pizza) o5).remA();
        System.out.println(oR.getClass().getSuperclass().getSimpleName() + "\n\n");

        System.out.println("========== End of what's new ==========");

    }
}
