package com.personal.aljfp.be_a_good_visitor.shape;

import com.personal.aljfp.be_a_good_visitor.visitor.ShapeVisitor;

public class Square extends Shape {
    int s;
    Square(int _s) {
        s = _s;
    }

    public boolean accept(ShapeVisitor ask) {
        return ask.forSquare(s);
    }
}
