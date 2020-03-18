package com.behavioral.d01_strategy_pattern;

import com.behavioral.d01_strategy_pattern.strategy.Strategy;

/**
 * @author xjn
 * @since 2020-02-19
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
