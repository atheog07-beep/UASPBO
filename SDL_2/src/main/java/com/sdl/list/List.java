/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdl.list;

import com.sdl.latihan.MyItem;
import com.sdl.stack.MyNode;

/**
 *
 * @author puspa
 */
public class List{
    private MyNode first; 
    private MyNode last;
    private String name;

    /**
     * Konstruktor
     */
    public List() {
        this.first=null;
        this.last = null;
    }
    
    /**
     * Fungsi cek list kosong
     * @return 
     */
    public boolean isEmpty(){
        return true;
    }
}
