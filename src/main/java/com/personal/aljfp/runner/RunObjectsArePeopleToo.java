package com.personal.aljfp.runner;

import com.personal.aljfp.objects_are_people_too.fish.Anchovy;
import com.personal.aljfp.objects_are_people_too.fish.Tuna;
import com.personal.aljfp.objects_are_people_too.pie.Bot;
import com.personal.aljfp.objects_are_people_too.pie.Pie;
import com.personal.aljfp.objects_are_people_too.pie.Top;

public class RunObjectsArePeopleToo {
    public static void runObjectsArePeopleToo() {
        System.out.println("============= Objects are people too ===========");

        Pie p = new Top(new Anchovy(),
                  new Top(new Tuna(),
                          new Top(new Anchovy(), new Bot()))
        );
        System.out.println(p.getClass().getSuperclass().getSimpleName() + "\n\n");


        Pie p1 = p.remA();
        System.out.println(p1.getClass().getSuperclass().getSimpleName() + "\n\n");

        Pie p2 = new Top(new Anchovy(), new Bot());
        System.out.println(p2.getClass().getSuperclass().getSimpleName() + "\n\n");

        Pie p3 = p2.remFish(new Anchovy());
        System.out.println(p3.getClass().getSuperclass().getSimpleName() + "\n\n");

        Pie p4 = new Top(new Integer(2),
                    new Top(new Integer(3),
                            new Top(new Integer(2),
                                    new Bot())));
        System.out.println(p4.getClass().getSuperclass().getSimpleName() + "\n\n");

        Pie p5 = p4.rem(new Integer(3));
        System.out.println(p5.getClass().getSuperclass().getSimpleName() + "\n\n");
    }
}
