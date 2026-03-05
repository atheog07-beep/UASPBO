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
public class Rekursif3Test {
    
    public Rekursif3Test() {
    }
    
    @Test
    public void test1(){
        int hasil = Rekursif.fibonaci(1, 2, 4);
        System.out.println("Hasil = "+hasil);
        assertEquals(5,Rekursif.fibonaci(1, 2, 4));
    }
    
    @Test
    public void test2(){
        int[] data = new int[5];
        data[0]=1;
        data[1]=2;
        data[2]=3;
        data[3]=4;
        data[4]=5;
        
        int hasil = Rekursif.arraySum(data,3);
        System.out.println("Hasil = "+hasil);
        assertEquals(10,Rekursif.arraySum(data, 3));
    }
    
    @Test
    public void test3(){
        int[] data = new int[5];
        data[0]=Rekursif.deretHitung(1, 3, 1);
        data[1]=Rekursif.deretHitung(1, 3, 2);
        data[2]=Rekursif.deretHitung(1, 3, 3);
        data[3]=Rekursif.deretHitung(1, 3, 4);
        data[4]=Rekursif.deretHitung(1, 3, 5);
        
        System.out.println("Hasil = "+data);
        int[] hasil = {1,4,7,10,13};
        
        assertArrayEquals(hasil,data);
    }
}
