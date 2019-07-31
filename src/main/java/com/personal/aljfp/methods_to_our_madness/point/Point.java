package com.personal.aljfp.methods_to_our_madness.point;

abstract class Point {

    int x;
    int y;

    Point(int _x, int _y) {
        x = _x;
        y = _y;
    }

    abstract int distanceToO();

    boolean closerToO(Point p) {
        return distanceToO() <= p.distanceToO();
    }
}


/*

    1. Abstract methods always belong the abstract class.
    2. Obligation: All methods that extend a abstract class must contain the matching method

 */