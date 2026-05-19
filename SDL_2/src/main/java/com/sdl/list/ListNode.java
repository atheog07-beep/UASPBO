/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sdl.list;

import com.sdl.latihan.MyItem;

/**
 *
 * @author user
 */
public class ListNode {
    private MyItem data;
    private ListNode next;

    /**
     * Konstruktor
     */
    public ListNode() {
    }

    /**
     * Konstruktor
     * @param data
     * @param next 
     */
    public ListNode(MyItem data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    /**
     * Konstruktor
     * @param item
     * @param numbers 
     */
    public ListNode(String item, int numbers){
        this.data = new MyItem();
        this.data.setItem(item);
        this.data.setNumbers(numbers);
        this.next=null;
    }
    /**
     * @return the data
     */
    public MyItem getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(MyItem data) {
        this.data = data;
    }

    /**
     * @return the next
     */
    public ListNode getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(ListNode next) {
        this.next = next;
    }
    
}
