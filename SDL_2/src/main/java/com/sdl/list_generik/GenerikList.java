/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdl.list_generik;

/**
 *
 * @author puspa
 */
public class GenerikList<T> {
    private GenerikNode<T> first;
    private GenerikNode<T> last;

    public GenerikList() {
        this.first=null;
        this.last=null;
    }


    /**
     * @return the first
     */
    public GenerikNode<T> getFirst() {
        return first;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(GenerikNode<T> first) {
        this.first = first;
    }

    /**
     * @return the last
     */
    public GenerikNode<T> getLast() {
        return last;
    }

    /**
     * @param last the last to set
     */
    public void setLast(GenerikNode<T> last) {
        this.last = last;
    }
    
    public boolean isEmpty(){
        if(this.first==null && this.last==null)
            return true;
        else
            return false;
    }
    
    public void addFirst(T node){
        GenerikNode<T> tmp = new GenerikNode<T>(node); 
        if(isEmpty()){
            this.first=tmp;
            this.last=tmp;
        } else{
            tmp.setNext(this.first);
            this.first = tmp;
        }
    }
    
    public void addLast(T node){
        GenerikNode<T> tmp = new GenerikNode<T>(node); 
        
    }
    
    public T deleteFirst(){
        return null;
    }
    
    public T deleteLast(){
        return null;
    }
    
}
