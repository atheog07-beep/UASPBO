/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stack.test;

import com.sdl.stack.MyNode;
import com.sdl.stack.MyStack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author puspa
 */
public class MyStackTest {
    
    public MyStackTest() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @Test
    public void test(){
        MyStack stack = new MyStack();
        MyNode node1 = new MyNode(null,"A",4);
        MyNode node2 = new MyNode(null,"B",3);
        MyNode node3 = new MyNode(null,"C",2);
        MyNode node4 = new MyNode(null,"D",1);
        
        assertEquals(true,stack.isEmpty());
        assertEquals(0,stack.getSize());
    }
    
    @Test
    public void test1(){
        MyStack stack = new MyStack();
        MyNode node1 = new MyNode(null,"A",4);
        MyNode node2 = new MyNode(null,"B",3);
        MyNode node3 = new MyNode(null,"C",2);
        MyNode node4 = new MyNode(null,"D",1);
        
        // test stack isi satu node
        stack.push(node1);
        MyNode node5 = stack.pop();
        assertEquals("A = 4}",node5.toString());
        MyNode node6 = stack.pop();
        assertEquals(null,node6);
        
        // test stack diisi banyak node
        assertEquals(true,stack.isEmpty());
        assertEquals(0,stack.getSize());
        stack.push(node1); // push stack
        stack.push(node2);
        stack.push(node3);
        stack.push(node4);
        assertEquals(4,stack.getSize());
        assertEquals(false,stack.isEmpty());
        node5 = stack.pop(); // pop stack
        assertEquals("D = 1}",node5.toString());
        
    }
}
