package com.personal.aljfp.be_a_good_visitor.shape;

import com.personal.aljfp.be_a_good_visitor.visitor.ShapeVisitor;
import com.personal.aljfp.be_a_good_visitor.visitor.UnionVisitor;

public class Union extends Shape {
    Shape s;
    Shape t;
    Union(Shape _s, Shape _t) {
        s = _s;
        t = _t;
    }

    public boolean accept(ShapeVisitor ask) {
        return ((UnionVisitor)ask).forUnion(s, t);
    }
}
