package com.personal.aljfp.be_a_good_visitor.visitor;
import com.personal.aljfp.be_a_good_visitor.point.Point;
import com.personal.aljfp.be_a_good_visitor.shape.Shape;

public class HasPt implements ShapeVisitor {
    Point p;
    HasPt(Point _p) {
        p = _p;
    }

    ShapeVisitor newHasPt(Point p) {
        return new HasPt(p);
    }

    public boolean forCircle(int r) {
        return p.distanceToO() <= r;
    }

    public boolean forSquare(int s) {
        if (p.x <= s) {
            return (p.y <= s);
        }
        else {
            return false;
        }
    }

    public boolean forTrans(Point q, Shape s) {
//        return s.accept(new HasPt(p.minus(q)));
        return s.accept(newHasPt(p.minus(q)));
    }
}
