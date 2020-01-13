package com.personal.aljfp.be_a_good_visitor.shape;

import com.personal.aljfp.be_a_good_visitor.visitor.ShapeVisitor;

public class Circle extends Shape {
    int r;
    Circle(int _r) {
        r = _r;
    }

    public boolean accept(ShapeVisitor ask) {
        return ask.forCircle(r);
    }
}
