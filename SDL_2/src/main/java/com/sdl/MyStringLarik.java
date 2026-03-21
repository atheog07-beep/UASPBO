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
    private String[] data; // larik penyimpan data

    public MyStringLarik() {
    }

    /**
     * Konstruktor; dengan tugas meng-instance-kan larik data
     * @param size 
     */
    public MyStringLarik(int size) {
        this.size = size;
        this.data = new String[size];
    }
    
    public MyStringLarik(String[] data){
        this.data = data;
        this.size = data.length;
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
    public String[] getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String[] data) {
        this.data = data;
    }
    
     /**
     * Fungsi untuk mengisi suatu nilai di larik data
     * @param indeks
     * @param value 
     */
    public void append(int indeks,String value){
        this.data[indeks]= value;
    }
    
    /**
     * Fungsi untuk mengambil nilai dari larik data sesuai posisi masukan indeks.
     * @param indeks
     * @return 
     */
    public String getValue(int indeks){
        if (indeks < this.getSize())
            return this.data[indeks];
        else
            return "out of range";
    }

    /**
     * Fungsi untuk memeriksa apakah string value ada di larik data
     * @param value
     * @return 
     */
    public boolean isExist(String value){
        for (String string : data) {
            if (string.equals(value))
                return true;
        }
        return false;
    }
    
    /**
     * Fungsi untuk menghitung jumlah string value yang ada di larik data
     * @param value
     * @return 
     */
    public int getNumbers(String value){
        int sum = 0;
        if(isExist(value)){
            for (String string : data) {
                if (string.equals(value))
                    sum = sum+1;
            }
        }
        return sum;       
    }


    public int sequentialSearch(String adi) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(adi)) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(String adi) {
        int low = 0;
        int high = data.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int hasil = data[mid].compareTo(adi);

            if (hasil == 0) {
                return mid;
            } else if (hasil > 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
 public boolean isStringExist(String input) {
    return sequentialSearch(input) != -1;
}
}

  
