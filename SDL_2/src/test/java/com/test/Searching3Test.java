/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import com.sdl.MyStringLarik;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author puspa
 */
public class Searching3Test {
    
    public Searching3Test() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @Test
    public void testIsExist(){
        String[] data ={"adi","puspa","budi","dina","susi"};
        MyStringLarik test = new MyStringLarik(data);
        assertEquals(Boolean.TRUE,test.isStringExist("adi"));
        assertEquals(Boolean.FALSE,test.isStringExist("joni"));
    }
    
}
