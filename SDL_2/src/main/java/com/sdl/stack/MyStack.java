/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdl.stack;

/**
 *
 * @author puspa
 */
public class MyStack {
    private MyNode last; // obyek last berkelas MyNode
    private int size; // atribut menghitung jumlah/isi stack
    /**
     * Konstruktor
     */
    public MyStack() {
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
    public void push(MyNode node){
        // cek stack kosong
        if (isEmpty()){
            last=node;
            this.size=1;
        } else{
            //stack tidak kosong
            node.setNext(this.last);
            this.last = node;
        }
        this.size ++;
    }
    
    /**
     * Fungsi pop, ambil node dari stack.
     * @return 
     */
    public MyNode pop(){
        // cek stack kosong
        if (last==null){
            return null;
        } else {
            //stack tidak kosong
            MyNode result = this.last;
            this.last = result.getNext();
            result.setNext(null);
            this.size --;
            return result;
        }
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
     * Fungsi untuk menghitung total atribut nummbers
     * @return 
     */
    public int getTotalNumbers(){
        int total = 0;
        
        return total;
    }
    
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        MyNode node1 = new MyNode(null,"A",4);
        MyNode node2 = new MyNode(null,"B",3);
        MyNode node3 = new MyNode(null,"C",2);
        MyNode node4 = new MyNode(null,"D",1);
        
        // test stack isi satu node
        stack.push(node1);
        MyNode node5 = stack.pop();
        System.out.println(node5);
        MyNode node6 = stack.pop();
        System.out.println(node6);
        
        // test stack diisi banyak node
        stack.push(node1); // push stack
        stack.push(node2);
        stack.push(node3);
        stack.push(node4);
        node5 = stack.pop(); // pop stack
        System.out.println(node5);
        int result = stack.getTotalNumbers();
        System.out.println("Total = "+result);
    }

    
}
