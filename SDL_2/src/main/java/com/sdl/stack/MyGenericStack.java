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
public class MyGenericStack<T> {
    private T last;
    private int size;

    /**
     * Konstruktor
     */
    public MyGenericStack() {
    }

    /**
     * Konstruktor
     * @param last
     * @param size 
     */
    public MyGenericStack(T last, int size) {
        this.last = last;
        this.size = size;
    }

    /**
     * @return the last
     */
    public T getLast() {
        return last;
    }

    /**
     * @param last the last to set
     */
    public void setLast(T last) {
        this.last = last;
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
     * Fungsi memeriksa stack kosong atau tidak
     * @return 
     */
    public boolean isEmpty(){
        return true;
    }
    
        /**
     * Fungsi push ke stack. setiap push, node last menjadi paling awal
     * @param node 
     */
    public void push(T node){
        // cek stack kosong
        if (isEmpty()){
            last=node;
        } else{
            //stack tidak kosong
            
        }
    }
    
    /**
     * Fungsi pop, ambil node dari stack.
     * @return 
     */
    public T pop(){
        // cek stack kosong
        if (last==null){
            return null;
        } else {
            //stack tidak kosong
           
            return null;
        }
    }

    public static void main(String[] args) {
        // buat item
        MyItem item1 = new MyItem("A",4);
        // buat node
        MyGenericNode<MyItem> node1 = new MyGenericNode<MyItem>(item1,null);
        // test node
        String result = node1.getData().toString();
        System.out.println(result);
    }
}
