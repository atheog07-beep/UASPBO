/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.sdl.*;

/**
 *
 * @author puspa
 */
public class SortTest {
    
    public SortTest() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @Test
    public void testSort1(){
        double[] data = {5,4,1,10,21,15,13};
        double[] data1 = MyLarik.getChangeData(data,0,2);
        assertEquals(1.0,data1[0]);
    }
    
}
