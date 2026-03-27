/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.sort;

import com.sdl.MyLarik;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author puspa
 */
public class SortTest3 {
    
    public SortTest3() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @Test
    public void sortTest(){
        double[] data = {5,4,1,10,21,15,13};
        int maxIndeks = MyLarik.getMaxData(data,0,2);
        assertEquals(0,maxIndeks);
    }
}
