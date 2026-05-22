/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdl.latihan;

/**
 *
 * @author puspa
 */
public class MyItemLarikDebug {
    public static void main(String[] args) {
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
    }
}
