package com.personal.aljfp;

import com.personal.aljfp.print_class_hierarchy.PrintClassHierarchy;

import static com.personal.aljfp.runner.RunMethodsToMadness.runMethodsToMadness;
import static com.personal.aljfp.runner.RunModernToys.runModernToys;
import static com.personal.aljfp.runner.RunObjectsArePeopleToo.runObjectsArePeopleToo;
import static com.personal.aljfp.runner.RunWhatsNew.runWhatsNew;
import static com.personal.aljfp.runner.RunToComeToOurCorousel.runComeToOurCorousel;

public class App {

    static PrintClassHierarchy pch;

    public static void main(String[] args) {
        System.out.println("Hello from, A little Java, a few patterns");
        runModernToys();
        runMethodsToMadness();
        runWhatsNew();
        runComeToOurCorousel();
        runObjectsArePeopleToo();

        //Page 94
    }

    public static void rH(Object o) {
        pch = new PrintClassHierarchy(o.getClass());
        pch.printHierarchy();
        System.out.println("\n\n");
    }

}


