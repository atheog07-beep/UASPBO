/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import com.sdl.Rekursif;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author puspa
 */
public class Rekursif4Test {
    
    public Rekursif4Test() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @Test
    public void test1(){
        int[] hasil = {1,4,7,10,13};
        int[] awal = new int[5];
        int[] data = Rekursif.getDeretHitung(awal,1, 3, 4);
        assertArrayEquals(hasil,data);
    }
    
}
