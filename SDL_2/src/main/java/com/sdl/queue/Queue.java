/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sdl.queue;

import com.sdl.list.List;
import com.sdl.list.ListNode;

/**
 *
 * @author user
 */
public class Queue {
    private List antrian;

    /**
     * Konstruktor
     */
    public Queue() {
        this.antrian = new List();
    }

    /**
     * Konstruktor
     * @param antrian 
     */
    public Queue(List antrian) {
        this.antrian = antrian;
    }
    
    /**
     * Fungsi menambah antrian
     * @param node 
     */
    public void enqueue(ListNode node){
        
    }
    
    /**
     * Fungsi untuk mengeluarkan antrian
     * @return 
     */
    public ListNode dequeue(){
        return null;
    }
    
    /**
     * Fungsi untuk memeriksa antrian kosong
     * @return 
     */
    public boolean isEmpty(){
        return true;
    }
    
    /**
     * Fungsi untuk menghitung jumlah node
     * @return 
     */
    public int getSize(){
        return 0;
    }
    
    /**
     * Fungsi penghitung jumlah atribut numbers
     * @return 
     */
    public int getSumOfTotalNumbers(){
        return 0;
    }
}
