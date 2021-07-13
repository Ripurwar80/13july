package com.coralogix.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculatorApplicationTests {

	@Test
	CalculatorApplicationTests calculator = new CalculatorApplicationTests();
        int add = calculator.add(5, 4);
        System.out.println("Test 1");
        Assertions.assertEquals(9, add, "The sum is correct");
        add = calculator.add(6, 9);
        Assertions.assertEquals(15, add, "The sum is correct");
        System.out.println("Test 2");

}
