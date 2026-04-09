/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sdl.latihan;

/**
 *
 * @author user
 */
public class MyItem {
    private String item; // data item bertipe string. dapat diisi misalnya nama negara, nama prodi, nama sekolah, dll
    private int numbers; // data numbers bertipe int, dapat diisi data jumlah item seperti jumlah penduduk negara, jumlah mahasiswa prodi, dll

    /**
     * Konstruktor
     */
    public MyItem() {
    }

    /**
     * Konstruktor dengan parameter data item dan numbers
     * @param item
     * @param numbers 
     */
    public MyItem(String item, int numbers) {
        this.item = item;
        this.numbers = numbers;
    }

    /**
     * @return the item
     */
    public String getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     * @return the numbers
     */
    public int getNumbers() {
        return numbers;
    }

    /**
     * @param numbers the numbers to set
     */
    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "MyItem{" + "item=" + item + ", numbers=" + numbers + '}';
    }
    
}
