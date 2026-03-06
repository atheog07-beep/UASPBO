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
public class RekursifTest {
    
    public RekursifTest() {
    }
    
    @Test
    public void test1(){
        int hasil_faktorial = Rekursif.faktorial(2);
        System.out.println("Hasil = "+hasil_faktorial);
        assertEquals(2,Rekursif.faktorial(2));
        assertEquals(6,Rekursif.faktorial(3));
    }
    @Test
    public void test2(){
        int hasil_fibonaci = Rekursif.fibo(3);
        System.out.println("Hasil = "+hasil_fibonaci);
        assertEquals(2,Rekursif.fibo(3));
    }
}
