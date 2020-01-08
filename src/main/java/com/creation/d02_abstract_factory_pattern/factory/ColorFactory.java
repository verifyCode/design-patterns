package com.creation.d02_abstract_factory_pattern.factory;

import com.creation.d02_abstract_factory_pattern.clz.color.Blue;
import com.creation.d02_abstract_factory_pattern.clz.color.Color;
import com.creation.d02_abstract_factory_pattern.clz.color.Green;
import com.creation.d02_abstract_factory_pattern.clz.color.Red;
import com.creation.d02_abstract_factory_pattern.clz.shape.Shape;

import java.util.Objects;

/**
 * @author xjn
 * @since 2020-01-08
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(Class aClass) {
        if (Objects.equals(Blue.class, aClass)) {
            return new Blue();
        } else if (Objects.equals(Green.class, aClass)) {
            return new Green();
        } else if (Objects.equals(Red.class, aClass)) {
            return new Red();
        }
        return null;
    }

    @Override
    public Shape getShape(Class aClass) {
        return null;
    }
}
