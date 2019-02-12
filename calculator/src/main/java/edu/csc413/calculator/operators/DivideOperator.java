package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class DivideOperator extends Operator {
    @Override
    public int priority() {
        int priority = 2;
        return priority;
    }

    @Override
    public Operand execute(Operand op1, Operand op2) {
        Operand ans = new Operand(op1.getValue() / op2.getValue());
        return ans;
    }
}