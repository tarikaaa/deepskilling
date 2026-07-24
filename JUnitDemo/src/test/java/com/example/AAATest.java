package com.example;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AAATest {

    private Calculator calculator;

    @Before
    public void setUp() {
        System.out.println("Setup: Creating Calculator object");
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        System.out.println("Teardown: Destroying Calculator object");
        calculator = null;
    }

    @Test
    public void testAddition() {

       
        int a = 10;
        int b = 20;

       
        int result = calculator.add(a, b);

        
        assertEquals(30, result);
    }
}