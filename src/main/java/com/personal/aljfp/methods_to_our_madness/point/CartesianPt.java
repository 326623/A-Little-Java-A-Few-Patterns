package com.personal.aljfp.methods_to_our_madness.point;

import com.personal.aljfp.methods_to_our_madness.point.Point;

public class CartesianPt extends Point {

    public CartesianPt(int _x, int _y) {
        super(_x, _y);
    }

    public int distanceToO() {
        return (int) Math.abs(Math.sqrt((x * x) + (y * y)));
    }

}
