package com.behavioral.d01_strategy_pattern.strategy;

/**
 * @author xjn
 * @since 2020-02-19
 */
public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
