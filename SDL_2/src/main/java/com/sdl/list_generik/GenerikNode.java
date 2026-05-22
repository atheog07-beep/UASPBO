/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdl.list_generik;

import com.sdl.latihan.MyItem;

/**
 *
 * @author puspa
 */
public class GenerikNode<T> {
    private T data;
    private GenerikNode next;

    public GenerikNode(T item) {
        this.data = item;
    }

    /**
     * @return the data
     */
    public T getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * @return the next
     */
    public GenerikNode getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(GenerikNode next) {
        this.next = next;
    }
    
    
}
