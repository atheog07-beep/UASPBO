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
    }

    public GenerikList(GenerikNode<T> first, GenerikNode<T> last) {
        this.first = first;
        this.last = last;
    }
    
    
}
