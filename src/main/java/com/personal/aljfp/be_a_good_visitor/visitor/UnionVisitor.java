package com.personal.aljfp.be_a_good_visitor.visitor;

import com.personal.aljfp.be_a_good_visitor.shape.Shape;

public interface UnionVisitor extends ShapeVisitor {
    boolean forUnion(Shape s, Shape t);
}
