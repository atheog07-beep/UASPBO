/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generic.test;

import com.sdl.latihan.MyItem;
import com.sdl.list_generik.*;
import com.sdl.sekolah.Siswa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author puspa
 */
public class GenericListTest {
    
    public GenericListTest() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @Test
    public void test1(){
        MyItem item1 = new MyItem("A",4);
        MyItem item2 = new MyItem("B",3);
        GenerikNode<MyItem> node1 = new GenerikNode<MyItem>(item1);
        GenerikNode<MyItem> node2 = new GenerikNode<MyItem>(item2);
        
        Siswa siswa1 = new Siswa(1,"Puspa");
        Siswa siswa2 = new Siswa(2,"Adi");
        GenerikNode<Siswa> nodeSiswa1 = new GenerikNode<Siswa>(siswa1);
        GenerikNode<Siswa> nodeSiswa2 = new GenerikNode<Siswa>(siswa2);
        
    }
    
}
