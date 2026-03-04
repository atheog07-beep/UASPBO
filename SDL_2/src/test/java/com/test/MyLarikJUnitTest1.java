/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.sdl.MyLarik;

/**
 *
 * @author puspa
 */
public class MyLarikJUnitTest1 {
    
    public MyLarikJUnitTest1() {
    }
    
    @Test
    public void testMyLarik() {
       int[] data = MyLarik.getSeries(0, 5, 2);
       assertEquals(0,data[0]);
       assertEquals(2,data[1]);
       assertNotEquals(2,data[0]);
    }
}
