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
public class Searching2Test {
    
    public Searching2Test() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @Test
    public void testSequential(){
        String[] data ={"adi","puspa","budi","dina","susi"};
        MyStringLarik test = new MyStringLarik(data);
        assertEquals(0,test.sequentialSearch("adi"));
        assertEquals(-1,test.sequentialSearch("joni"));
    }
    
    @Test
    public void testBinary(){
        String[] data ={"adi","puspa","budi","dina","susi"};
        Arrays.sort(data);
        MyStringLarik test = new MyStringLarik(data);
        assertEquals(0,test.binarySearch("adi"));
        assertEquals(-1,test.binarySearch("joni"));
    }
}
