/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdl.list;



/**
 *
 * @author puspa
 */
public class List{
    private ListNode first; 
    private ListNode last;
    private String name;

    /**
     * Konstruktor
     */
    public List() {
        this.first=null;
        this.last = null;
    }
   

    /**
     * @return the first
     */
    public ListNode getFirst() {
        return first;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(ListNode first) {
        this.first = first;
    }

    /**
     * @return the last
     */
    public ListNode getLast() {
        return last;
    }

    /**
     * @param last the last to set
     */
    public void setLast(ListNode last) {
        this.last = last;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Fungsi cek list kosong
     * @return 
     */
    public boolean isEmpty(){
        return true;
    }
    
    /**
     * Fungsi tambah item di awal
     * @param item 
     */
    public void addFirst(ListNode node){
        
    }
    
    /**
     * Fungsi tambah item di akhir
     * @param item 
     */
    public void addLast(ListNode node){
        
    }
    
    /**
     * Fungsi hapus awal
     * @return 
     */
    public ListNode deleteFirst(){
        return null;
    }
    
    /**
     * Fungsi hapus akhir
     * @return 
     */
    public ListNode deleteLast(){
        return null;
    }
    
    /**
     * Fungsi hitung ukuran list
     * @return 
     */
    public int getSize(){
        return 0;
    }
    
    /**
     * Fungsi untuk menghitung seluruh atribut numbers dari node
     * @return 
     */
    public int getSumOfTotalNumbers(){
        return 0;
    }
    
    /**
     * Fungsi untuk mengubah semua node ke string dari node first sampai last.
     * @return 
     */
    public String toString(){
        return null;
    }
}
