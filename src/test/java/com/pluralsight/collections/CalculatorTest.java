package com.pluralsight.collections;

import com.pluralsight.collections.c_stacks.Calculator;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void shouldEvaluateConstants(){
        int result = calculator.evalute("1");
        assertEquals(1,result);
    }

    @Test
    public void shouldSupportAdding(){
        int result = calculator.evalute("1 + 2");
        assertEquals(3,result);
    }

    @Test
    public void shouldSupportAddingSubtraction(){
        int result = calculator.evalute("1 - 2");
        assertEquals(-1,result);
    }

    @Test
    public void shouldComplexStatements(){
        int result = calculator.evalute("1 - 3 + 2 + 4");
        assertEquals(4,result);
    }



}
