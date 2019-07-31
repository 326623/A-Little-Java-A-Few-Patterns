package com.personal.aljfp.runner;

import com.personal.aljfp.modern_toys.layer.Base;
import com.personal.aljfp.modern_toys.num.OneMoreThan;
import com.personal.aljfp.modern_toys.num.Zero;
import com.personal.aljfp.modern_toys.point.CartesianPt;
import com.personal.aljfp.modern_toys.point.ManhattanPt;
import com.personal.aljfp.modern_toys.seasoning.Pepper;
import com.personal.aljfp.modern_toys.seasoning.Sage;
import com.personal.aljfp.modern_toys.seasoning.Salt;
import com.personal.aljfp.modern_toys.seasoning.Thyme;

import static com.personal.aljfp.App.rH;

public class RunModernToys {

    public static void runModernToys() {
        System.out.println(5);
        System.out.println(-23);
        System.out.println(5.32);

        System.out.println(false);

        rH(new Salt());
        rH(new Pepper());
        rH(new Thyme());
        rH(new Sage());
        rH(new CartesianPt(0, 0 ));
        rH(new ManhattanPt(0, 0));

        Object o = new OneMoreThan(
                new OneMoreThan(
                        new Zero()));

        rH(o);

        //Not valid since 0 != new Zero()
        //o = new OneMoreThan(0);

        //lets test deep nested structures
        o = new OneMoreThan(
                new OneMoreThan(
                        new OneMoreThan(
                                new OneMoreThan(
                                        new Zero()
                                )
                        )
                )
        );

        System.out.println("Deep nested structure");
        rH(o);


        System.out.println("General object initializer");
        o = new Base(
                new Zero()
        );
        rH(o);

        System.out.println("With a new object initializer");
        o = new Base(
                new Salt()
        );
        rH(o);


        System.out.println("========= Done with Modern toys chapter ==========");
    }
}
