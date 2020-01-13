package com.personal.aljfp.be_a_good_visitor.point;
import java.lang.Math;

public class CartesianPt extends Point {
    CartesianPt(int _x, int _y) {
        super(_x, _y);
    }

    @Override
    public int distanceToO() {
        return (int)Math.sqrt(x * x + y * y);
    }
}
