package com.gabriela;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue(){
        assertTrue( true );
    }
    @Test
    public void testSoma(){
        int num1 = 1;
        int num2 = 2;
        assertEquals(2, num1 + num2);
    }
}
