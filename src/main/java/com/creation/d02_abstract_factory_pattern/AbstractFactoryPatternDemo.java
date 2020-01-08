package com.creation.d02_abstract_factory_pattern;

import com.creation.d02_abstract_factory_pattern.clz.color.Color;
import com.creation.d02_abstract_factory_pattern.clz.color.Red;
import com.creation.d02_abstract_factory_pattern.clz.shape.Circle;
import com.creation.d02_abstract_factory_pattern.clz.shape.Shape;
import com.creation.d02_abstract_factory_pattern.factory.AbstractFactory;
import com.creation.d02_abstract_factory_pattern.factory.ColorFactory;
import com.creation.d02_abstract_factory_pattern.factory.ShapeFactory;

/**
 * @author xjn
 * @since 2020-01-08
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(ShapeFactory.class);
        Shape circle = shapeFactory.getShape(Circle.class);
        circle.draw();
        AbstractFactory colorFactory = FactoryProducer.getFactory(ColorFactory.class);
        Color color = colorFactory.getColor(Red.class);
        color.fill();

    }
}
