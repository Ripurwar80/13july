package com.coralogix.calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class sumtest {
	@Test
	sum calculator = new sum();
        int total = calculator.add(5, 4);
        //System.out.println("Test_1");
        Assertions.assertEquals(9, total, "The sum is correct");
        total = calculator.add(6, 9);
        Assertions.assertEquals(15, total, "The sum is correct");
        //System.out.println("Test_2");

}
