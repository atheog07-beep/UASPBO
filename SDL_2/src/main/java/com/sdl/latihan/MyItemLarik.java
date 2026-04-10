/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sdl.latihan;

/**
 *
 * @author user
 */
public class MyItemLarik {
    // larik penyimpan data bertipe Student
    private MyItem[] data;

    /**
     * Konstruktor
     */
    public MyItemLarik() {
    }

    /**
     * Konstruktor
     * @param data 
     */
    public MyItemLarik(MyItem[] data) {
        this.data = data;
    }
    
    /**
     * Konstruktor
     * @param size 
     */
    public MyItemLarik(int size) {
        this.data = new MyItem[size];
    }

    /**
     * @return the data
     */
    public MyItem[] getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(MyItem[] data) {
        this.data = data;
    }
    
    /**
     * Fungsi untuk menambah item ke atribut data sesuai indeks yang ada di parameter
     * @param item 
     * @param indeks
     */
    public void append(MyItem item, int indeks){
        
    }
    
    /**
     * Fungsi untuk menghitung ukuran Array/Larik
     * @return 
     */
    public int getDataSize(){
        return 0;
    }
    
    /**
     * Fungsi untuk mencari posisi item. Luaran fungsi adalah indeks item. Jika tidak ada, luarannya -1.
     * @param item
     * @return 
     */
    public int itemSearch(String item){
        return -1;
    }
    
    /**
     * Fungsi sorting berdasarkan masukan tipe.
     * tipe = 0, sorting berdasar String item secara ascending (kecil ke besar)
     * tipe = 1, sorting berdasar int numerik; secara ascending (kecil ke besar)
     * @param type 
     */
    public void itemSort(int type){
        
    }
    
    /**
     * Fungsi untuk menghitung jumlahan dari atribut numbers pada item yang sama
     * @return 
     */
    public MyItemLarik getItemSum(){
        return null;
    }
}
