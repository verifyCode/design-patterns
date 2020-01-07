package com.creation.d01_factory_pattern;

import com.creation.d01_factory_pattern.clz.Circle;
import com.creation.d01_factory_pattern.clz.Shape;
import com.creation.d01_factory_pattern.clz.Square;

import java.util.Objects;

/**
 * @author xjn
 * @since 2020-01-06
 */
public class ShapeFactory {
    public static Shape getShape(Class classes) {
        if (classes == null) {
            return null;
        }
        if (Objects.equals(classes, Square.class)) {
            return new Square();
        } else if (Objects.equals(classes, Circle.class)) {
            return new Circle();
        }
        return null;
    }

    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape(Square.class);
        shape.draw();
        Shape shape1 = ShapeFactory.getShape(Circle.class);
        shape1.draw();
    }
}
