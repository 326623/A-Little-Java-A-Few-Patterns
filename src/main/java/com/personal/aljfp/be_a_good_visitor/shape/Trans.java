package com.personal.aljfp.be_a_good_visitor.shape;

import com.personal.aljfp.be_a_good_visitor.point.Point;
import com.personal.aljfp.be_a_good_visitor.visitor.ShapeVisitor;

// A Shape s located at Point q. Square south west corner sitting at Point q.
// Circle's center sitting at Point q.
public class Trans extends Shape {
    Point q;
    Shape s;
    Trans(Point _q, Shape _s) {
        q = _q;
        s = _s;
    }

    public boolean accept(ShapeVisitor ask) {
        return ask.forTrans(q, s);
    }
}
