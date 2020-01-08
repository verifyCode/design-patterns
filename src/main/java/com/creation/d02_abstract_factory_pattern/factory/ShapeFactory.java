package com.creation.d02_abstract_factory_pattern.factory;

import com.creation.d02_abstract_factory_pattern.clz.color.Color;
import com.creation.d02_abstract_factory_pattern.clz.shape.Circle;
import com.creation.d02_abstract_factory_pattern.clz.shape.Rectangle;
import com.creation.d02_abstract_factory_pattern.clz.shape.Shape;
import com.creation.d02_abstract_factory_pattern.clz.shape.Square;
import com.creation.d02_abstract_factory_pattern.factory.AbstractFactory;

import java.util.Objects;

/**
 * @author xjn
 * @since 2020-01-08
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(Class aClass) {
        return null;
    }

    @Override
    public Shape getShape(Class aClass) {
        if (Objects.equals(Circle.class, aClass)) {
            return new Circle();
        } else if (Objects.equals(Rectangle.class, aClass)) {
            return new Rectangle();
        } else if (Objects.equals(Square.class, aClass)) {
            return new Square();
        }
        return null;
    }
}
