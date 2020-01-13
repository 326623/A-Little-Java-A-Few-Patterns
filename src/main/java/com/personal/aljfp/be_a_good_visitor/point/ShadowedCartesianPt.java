package com.personal.aljfp.be_a_good_visitor.point;

public class ShadowedCartesianPt extends CartesianPt {
    int delta_x;
    int delta_y;

    ShadowedCartesianPt(int _x, int _y, int _delta_x, int _delta_y) {
        super(_x, _y);
        delta_x = _delta_x;
        delta_y = _delta_y;
    }

    @Override
    public int distanceToO() {
//        return super.distanceToO() +
//                (int)Math.sqrt(delta_x * delta_x + delta_y * delta_y);
        return new CartesianPt(x + delta_x, y + delta_y).distanceToO();
    }
}
