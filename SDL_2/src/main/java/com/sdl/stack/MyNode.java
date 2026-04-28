/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdl.stack;

import com.sdl.latihan.MyItem;

/**
 *
 * @author puspa
 */
public class MyNode extends MyItem{
    private MyNode next; // link ke sesama obyek MyNode

    /**
     * Konstruktor
     */
    public MyNode() {
    }

    /**
     * Konstruktor
     * @param next 
     */
    public MyNode(MyNode next) {
        this.next = next;
    }

    /**
     * Konstruktor
     * @param next
     * @param item
     * @param numbers 
     */
    public MyNode(MyNode next, String item, int numbers) {
        super(item, numbers);
        this.next = next;
    }

    /**
     * @return the next
     */
    public MyNode getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(MyNode next) {
        this.next = next;
    }
}
