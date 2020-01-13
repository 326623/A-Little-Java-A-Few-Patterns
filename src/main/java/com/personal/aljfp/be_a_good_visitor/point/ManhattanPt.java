package com.personal.aljfp.be_a_good_visitor.point;

public class ManhattanPt extends Point {
    ManhattanPt(int _x, int _y) {
        super(_x, _y);
    }

    @Override
    public int distanceToO() {
        return x + y;
    }
}
