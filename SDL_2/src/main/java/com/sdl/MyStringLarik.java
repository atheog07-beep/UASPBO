/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdl;

/**
 * Kelas ini merupakan kelas untuk memodelkan rangkaian data string.
 * @author puspa
 */
public class MyStringLarik {
    // size/panjang larik dengan tipe data int
    private int size; // ukuran larik
    // larik penyimpan data bertipe String
    private String data; // larik penyimpan data

    public MyStringLarik() {
    }

    /**
     * Konstruktor; dengan tugas meng-instance-kan larik data
     * @param size 
     */
    public MyStringLarik(int size) {
        this.size = size;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }
    
        /**
     * Fungsi untuk mengisi suatu nilai di larik data
     * @param indeks
     * @param value 
     */
    public void append(int indeks,String value){
        
    }
    
    /**
     * Fungsi untuk mengambil nilai dari larik data sesuai posisi masukan indeks.
     * @param indeks
     * @return 
     */
    public double getValue(int indeks){
        return 0;
    }

    /**
     * Fungsi untuk memeriksa apakah string value ada di larik data
     * @param value
     * @return 
     */
    public boolean isExist(String value){
        return false;
    }
    
    /**
     * Fungsi untuk menghitung jumlah string value yang ada di larik data
     * @param value
     * @return 
     */
    public int getNumbers(String value){
        return 0;    
    }
}
