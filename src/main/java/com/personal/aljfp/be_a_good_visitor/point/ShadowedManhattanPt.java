package com.personal.aljfp.be_a_good_visitor.point;

// It is a ManhattanPt with two additional fields. These two represent the
// information that determines how far the shadow is from the point with the
// fields x and y.
public class ShadowedManhattanPt extends ManhattanPt {
    int delta_x;
    int delta_y;

    ShadowedManhattanPt(int _x, int _y, int _delta_x, int _delta_y) {
        super(_x, _y);
        delta_x = _delta_x;
        delta_y = _delta_y;
    }

    @Override
    public int distanceToO() {
        return super.distanceToO() + delta_x + delta_y;
    }
}
