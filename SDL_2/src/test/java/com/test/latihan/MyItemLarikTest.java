/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.latihan;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.sdl.latihan.*;

/**
 *
 * @author puspa
 */
public class MyItemLarikTest {
    
    public MyItemLarikTest() {
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
        MyItem item1 = new MyItem("Matematika",10);
        MyItem item2 = new MyItem("Teknik Elektro",60);
        MyItem item3 = new MyItem("Informatika",200);
        MyItem item4 = new MyItem("Teknik Mesin",120);
        MyItem item5 = new MyItem("Farmasi",200);
        // tambah item
        test.append(item1, 0);
        test.append(item2, 1);
        test.append(item3, 2);
        test.append(item4, 3);
        test.append(item5, 4);
        // ambil data
        MyItem[] testLarik = test.getData();
        assertEquals("Farmasi",testLarik[4].getItem());
        assertEquals("Teknik Mesin",testLarik[3].getItem());
    }
    
    @Test
    public void test2(){
        // ini pengujian fungsi ukuran data
        // buat larik
        MyItemLarik test = new MyItemLarik(5);
        // buat obyek item
        MyItem item1 = new MyItem("Matematika",10);
        MyItem item2 = new MyItem("Teknik Elektro",60);
        MyItem item3 = new MyItem("Informatika",200);
        MyItem item4 = new MyItem("Teknik Mesin",120);
        MyItem item5 = new MyItem("Farmasi",200);
        // tambah item
        test.append(item1, 0);
        test.append(item2, 1);
        test.append(item3, 2);
        test.append(item4, 3);
        test.append(item5, 4);
        // ambil data Size
        assertEquals(5,test.getDataSize());
        
        // buat larik
        MyItemLarik test1 = new MyItemLarik(3);
        // buat obyek item
        MyItem item10 = new MyItem("Matematika",6);
        MyItem item20 = new MyItem("Teknik Elektro",12);
        MyItem item30 = new MyItem("Informatika",20);
        // tambah item
        test1.append(item10, 0);
        test1.append(item20, 1);
        test1.append(item30, 2);
        // ambil data Size
        assertEquals(3,test1.getDataSize());
    }
    
    @Test
    public void test3(){
        // ini pengujian fungsi pencarian/searching
        // buat larik
        MyItemLarik test = new MyItemLarik(5);
        // buat obyek item
        MyItem item1 = new MyItem("Matematika",10);
        MyItem item2 = new MyItem("Teknik Elektro",60);
        MyItem item3 = new MyItem("Informatika",200);
        MyItem item4 = new MyItem("Teknik Mesin",120);
        MyItem item5 = new MyItem("Farmasi",200);
        // tambah item
        test.append(item1, 0);
        test.append(item2, 1);
        test.append(item3, 2);
        test.append(item4, 3);
        test.append(item5, 4);
        // ambil data Size
        assertEquals(2,test.itemSearch("Informatika"));
        
        // buat larik
        MyItemLarik test1 = new MyItemLarik(3);
        // buat obyek item
        MyItem item10 = new MyItem("Matematika",6);
        MyItem item20 = new MyItem("Teknik Elektro",12);
        MyItem item30 = new MyItem("Informatika",20);
        // tambah item
        test1.append(item10, 0);
        test1.append(item20, 1);
        test1.append(item30, 2);
        // ambil data Size
        assertEquals(1,test1.itemSearch("Teknik Elektro"));
    }
    
    @Test
    public void test4(){
        // ini pengujian fungsi sorting
        // buat larik
        MyItemLarik test = new MyItemLarik(5);
        // buat obyek item
        MyItem item1 = new MyItem("Matematika",10);
        MyItem item2 = new MyItem("Teknik Elektro",60);
        MyItem item3 = new MyItem("Informatika",200);
        MyItem item4 = new MyItem("Teknik Mesin",120);
        MyItem item5 = new MyItem("Farmasi",200);
        // tambah item
        test.append(item1, 0);
        test.append(item2, 1);
        test.append(item3, 2);
        test.append(item4, 3);
        test.append(item5, 4);
        // ambil data Size
        test.itemSort(0);
        MyItem[] testLarik = test.getData();
        assertEquals("Farmasi",testLarik[0].getItem());
        
        // buat larik
        MyItemLarik test1 = new MyItemLarik(3);
        // buat obyek item
        MyItem item10 = new MyItem("Matematika",6);
        MyItem item20 = new MyItem("Teknik Elektro",12);
        MyItem item30 = new MyItem("Informatika",20);
        // tambah item
        test1.append(item10, 2);
        test1.append(item20, 1);
        test1.append(item30, 0);
        // ambil data Size
        test1.itemSort(1);
        MyItem[] testLarik1 = test1.getData();
        assertEquals("Informatika",testLarik1[2].getItem());
        
    }
}
