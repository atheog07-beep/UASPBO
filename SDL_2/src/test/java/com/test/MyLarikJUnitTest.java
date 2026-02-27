/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author puspa
 */
public class MyLarikJUnitTest {
    
    public MyLarikJUnitTest() {
    }
    
    @Test
    public void testMyLarik() {
        //test 1
        MyLarik test = new MyLarik(5);
        test.append(0,1);
        test.append(1,2);
        test.append(2,3);
        test.append(3,4);
        test.append(4,5);
        assertEquals(1,test.getValue(0));
        assertNotEquals(2,test.getValue(0));
        assertEquals("out of range",test.getValue(5));
    }

    @Test
    public void testMyLarik1() {
        //test 2
        MyLarik test = new MyLarik(5);
        test.append(0,1);
        test.append(1,2);
        test.append(2,3);
        test.append(3,4);
        test.append(4,5);
        assertEquals(1,test.getValue(0));
        assertEquals(3,test.getAverage());
    }
    
}
