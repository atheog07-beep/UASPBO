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
/**
 *
 * @author puspa
 */
public class Rekursif2Test {
    
    public Rekursif2Test() {
    }
    
    @Test
    public void test1(){
        //test fungsi paijo
        int hasil = Rekursif.paijo(3);
        System.out.println("hasil ="+hasil);
        assertEquals(21,Rekursif.paijo(3));
    }
    
    @Test
    public void test2(){
        // test fungsi upAndDown
        Rekursif.upAndDown(3);
    }
    
}
