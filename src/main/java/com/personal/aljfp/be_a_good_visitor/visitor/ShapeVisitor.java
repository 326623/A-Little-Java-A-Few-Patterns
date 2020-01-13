package com.personal.aljfp.be_a_good_visitor.visitor;
import com.personal.aljfp.be_a_good_visitor.point.Point;
import com.personal.aljfp.be_a_good_visitor.shape.Shape;

public interface ShapeVisitor {
    boolean forCircle(int r);
    boolean forSquare(int s);
    boolean forTrans(Point q, Shape s);
}
