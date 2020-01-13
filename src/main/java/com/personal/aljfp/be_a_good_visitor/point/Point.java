package com.personal.aljfp.be_a_good_visitor.point;

abstract public class Point {
    public int x;
    public int y;

    Point(int _x, int _y) {
        x = _x;
        y = _y;
    }

    boolean closerToO(Point p) {
        return distanceToO() <= p.distanceToO();
    }

    public Point minus(Point p) {
        return new CartesianPt(x - p.x, y - p.y);
    }

    public abstract int distanceToO();
}
