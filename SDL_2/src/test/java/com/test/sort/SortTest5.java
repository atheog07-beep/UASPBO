/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.sdl.MyLarik;
/**
 *
 * @author puspa
 */
public class SortTest5 {
    
    public SortTest5() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @Test
    public void testSort(){
        double[] data = {5,4,1,10,21,15,13};
        MyLarik test = new MyLarik(data);
        test.insertSort();
        test.cetakData();
    }
}
