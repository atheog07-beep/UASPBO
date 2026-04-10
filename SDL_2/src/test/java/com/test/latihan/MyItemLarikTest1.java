/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.latihan;

import com.sdl.latihan.MyItem;
import com.sdl.latihan.MyItemLarik;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author puspa
 */
public class MyItemLarikTest1 {
    
    public MyItemLarikTest1() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @Test
    public void test1(){
        // ini pengujian fungsi append
        // buat larik
        MyItemLarik test = new MyItemLarik(5);
        // buat obyek item
        MyItem item1 = new MyItem("Indomie",150);
        MyItem item2 = new MyItem("Mie Sedap",60);
        MyItem item3 = new MyItem("Indomie",200);
        MyItem item4 = new MyItem("Mie Sedap",120);
        MyItem item5 = new MyItem("Sarimi",20);
        // tambah item
        test.append(item1, 0);
        test.append(item2, 1);
        test.append(item3, 2);
        test.append(item4, 3);
        test.append(item5, 4);
        // buat data jumlahan pada item yang sama
        MyItemLarik testSum = test.getItemSum();
        testSum.itemSort(1);
        assertEquals("Sarimi",testSum.getData()[0].getItem());
        assertEquals("Indomie",testSum.getData()[2].getItem());
        assertEquals(350,testSum.getData()[2].getNumbers());
    }
}
