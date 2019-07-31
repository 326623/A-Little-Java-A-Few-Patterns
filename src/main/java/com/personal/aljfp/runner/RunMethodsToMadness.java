package com.personal.aljfp.runner;

import com.personal.aljfp.methods_to_our_madness.point.ManhattanPt;
import com.personal.aljfp.methods_to_our_madness.shish.Lamb;
import com.personal.aljfp.methods_to_our_madness.shish.Onion;
import com.personal.aljfp.methods_to_our_madness.shish.Skewer;

public class RunMethodsToMadness {

    public static void runMethodsToMadness() {

        System.out.println("========== Run methods to Madness ==========");

        System.out.println(new ManhattanPt(3, 4 ).distanceToO() + "\n\n");

        Object o = new Skewer();
        System.out.println(o.getClass().getSuperclass().getSimpleName() + "\n\n");

        o = new Onion(
                new Skewer()
        );
        System.out.println(o.getClass().getSuperclass().getSimpleName() + "\n\n");

        o = new Onion(
                new Lamb(
                        new Onion(
                                new Skewer()
                        )
                )
        );
        System.out.println(o.getClass().getSuperclass().getSimpleName() + "\n\n");

        o = new ManhattanPt(3, 5);
        System.out.println(o.getClass().getSuperclass().getSimpleName() + "\n\n");
        System.out.println();

        System.out.println("========== End of Run methods to Madness ==========");
    }
}
