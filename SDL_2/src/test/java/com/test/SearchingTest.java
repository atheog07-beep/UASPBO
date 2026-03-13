/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.sdl.*;
import java.util.Arrays;

/**
 *
 * @author puspa
 */
public class SearchingTest {
    
    public SearchingTest() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @Test
    public void testCetakArray(){
        double[] data = {5,4,1,10,21,15,13};
        MyLarik test = new MyLarik(data);
        test.cetakData();
        
        double[] data1 = {55,4,1,100,2,15,13};
        MyLarik test1 = new MyLarik(data1);
        test1.cetakData();
    }
    @Test
    public void testSequential(){
        double[] data = {5,4,1,10,21,15,13};
        MyLarik test = new MyLarik(data);
        assertEquals(0,test.sequentialSearch(5));
        assertEquals(-1,test.sequentialSearch(100));
        
        double[] data1 = {55,4,1,100,2,15,13};
        MyLarik test1 = new MyLarik(data1);
        assertEquals(1,test.sequentialSearch(4));
        assertEquals(-1,test.sequentialSearch(20));
    }
    
    @Test
    public void testBinary(){
        double[] data = {5,4,1,10,21,15,13};
        Arrays.sort(data);
        MyLarik test = new MyLarik(data);
        assertEquals(0,test.binarySearch(1));
        assertEquals(-1,test.binarySearch(100));
        
        double[] data1 = {55,4,1,100,2,15,13};
        Arrays.sort(data1);
        MyLarik test1 = new MyLarik(data1);
        assertEquals(0,test.binarySearch(1));
        assertEquals(-1,test.binarySearch(20));
    }
    
    @Test
    public void testInterpolation(){
        double[] data = {5,4,1,10,21,15,13};
        Arrays.sort(data);
        MyLarik test = new MyLarik(data);
        assertEquals(0,test.interpolationSearch(1));
        assertEquals(-1,test.interpolationSearch(100));
        
        double[] data1 = {55,4,1,100,2,15,13};
        Arrays.sort(data1);
        MyLarik test1 = new MyLarik(data1);
        assertEquals(0,test.interpolationSearch(1));
        assertEquals(-1,test.interpolationSearch(20));
    }
}
