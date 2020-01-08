package com.creation.d02_abstract_factory_pattern;

import com.creation.d02_abstract_factory_pattern.factory.AbstractFactory;
import com.creation.d02_abstract_factory_pattern.factory.ColorFactory;
import com.creation.d02_abstract_factory_pattern.factory.ShapeFactory;

import java.util.Objects;

/**
 * @author xjn
 * @since 2020-01-08
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(Class aClass) {
        if (Objects.equals(ShapeFactory.class, aClass)) {
            return new ShapeFactory();
        } else if (Objects.equals(ColorFactory.class, aClass)) {
            return new ColorFactory();
        }
        return null;
    }
}
