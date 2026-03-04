/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdl;

/**
 *
 * @author puspa
 */
public class MyStudentLarik {
    // size/panjang larik dengan tipe data int
    private int size; // ukuran larik
    // larik penyimpan data bertipe Student
    private Student[] data; // larik penyimpan data

    /**
     * Konstruktor
     */
    public MyStudentLarik() {
    }

    /**
     * Konstruktor dengan parameter masukan ukuran data
     * @param size 
     */
    public MyStudentLarik(int size) {
        this.size = size;
        this.data = new Student[this.size];
    }

    /**
     * Konstruktor dengan masukan data larik
     * @param data 
     */
    public MyStudentLarik(Student[] data) {
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
    public Student[] getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Student[] data) {
        this.data = data;
    }
    
    public void append(int indeks,Student value){
        this.data[indeks]=value;
    }
    
    /**
     * Fungsi untuk mengambil nilai dari larik data sesuai posisi masukan indeks.
     * @param indeks
     * @return 
     */
    public Student getValue(int indeks){
        return this.data[indeks];
    }
}
