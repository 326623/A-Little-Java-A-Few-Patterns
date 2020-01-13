package com.personal.aljfp.be_a_good_visitor.shape;

import com.personal.aljfp.be_a_good_visitor.visitor.ShapeVisitor;

public abstract class Shape {
    public abstract boolean accept(ShapeVisitor ask);
}
