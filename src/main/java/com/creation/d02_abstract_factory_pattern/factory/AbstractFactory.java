package com.creation.d02_abstract_factory_pattern.factory;

import com.creation.d02_abstract_factory_pattern.clz.color.Color;
import com.creation.d02_abstract_factory_pattern.clz.shape.Shape;

/**
 * @author xjn
 * @since 2020-01-08
 */
public abstract class AbstractFactory {

    public abstract Color getColor(Class aClass);

    public abstract Shape getShape(Class aClass);
}
