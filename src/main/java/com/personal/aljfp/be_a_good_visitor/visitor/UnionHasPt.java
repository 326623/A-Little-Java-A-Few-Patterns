package com.personal.aljfp.be_a_good_visitor.visitor;

import com.personal.aljfp.be_a_good_visitor.point.Point;
import com.personal.aljfp.be_a_good_visitor.shape.Shape;

public class UnionHasPt extends HasPt implements UnionVisitor {
    UnionHasPt(Point _p) {
        super(_p);
    }

    @Override
    ShapeVisitor newHasPt(Point p) {
        return new UnionHasPt(p);
    }

    public boolean forUnion(Shape s, Shape t) {
        if (s.accept(this)) {
            return true;
        }
        else {
            return t.accept(this);
        }
    }
}
