package com.personal.aljfp.methods_to_our_madness.point;

import com.personal.aljfp.methods_to_our_madness.point.Point;

public class ManhattanPt extends Point {

    public ManhattanPt(int _x, int _y) {
        super(_x, _y);
    }

    public int distanceToO() {
        return x + y;
    }

}
