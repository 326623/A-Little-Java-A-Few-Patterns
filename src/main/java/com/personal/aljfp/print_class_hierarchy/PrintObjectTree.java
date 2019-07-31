package com.personal.aljfp.print_class_hierarchy;

public class PrintObjectTree {

    public static void printObjectTree(Object o) {


        String className = o.getClass().getSimpleName();

        System.out.println("Got : " + className);
        System.out.println("----> Lets print the hierarchy");
        Object nextClass = o;
        while(!nextClass.getClass().getName().equalsIgnoreCase("object")) {
            System.out.println("  |" + o.getClass().getName());
            nextClass = nextClass.getClass();
        }
    }
}
