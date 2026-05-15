/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.list.test;

import com.sdl.list.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author user
 */
public class ListTest {
    
    public ListTest() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @Test
    public void test1(){
        ListNode node1 = new ListNode("A",4);
        ListNode node2 = new ListNode("B",3);
        ListNode node3 = new ListNode("C",2);
        ListNode node4 = new ListNode("D",1);
        
        List list = new List();
        assertEquals(0,list.getSize());
    }
    
    @Test
    public void test2(){
        ListNode node1 = new ListNode("A",4);
        ListNode node2 = new ListNode("B",3);
        ListNode node3 = new ListNode("C",2);
        ListNode node4 = new ListNode("D",1);
        
        List list = new List();
        assertEquals(0,list.getSize());
        list.addFirst(node1);
        assertEquals(1,list.getSize());
        assertEquals(false,list.isEmpty());
    }

    @Test
    public void test3(){
        ListNode node1 = new ListNode("A",4);
        ListNode node2 = new ListNode("B",3);
        ListNode node3 = new ListNode("C",2);
        ListNode node4 = new ListNode("D",1);
        
        List list = new List();
        assertEquals(0,list.getSize());
        list.addFirst(node1);
        assertEquals(1,list.getSize());
        assertEquals("A = 4",list.toString());
    }

    @Test
    public void test4(){
        ListNode node1 = new ListNode("A",4);
        ListNode node2 = new ListNode("B",3);
        ListNode node3 = new ListNode("C",2);
        ListNode node4 = new ListNode("D",1);
        
        List list = new List();
        assertEquals(0,list.getSize());
        list.addFirst(node1);
        assertEquals(1,list.getSize());
        assertEquals("A = 4",list.toString());
        
        list.addLast(node4);
        assertEquals(2,list.getSize());        
    }

    @Test
    public void test5(){
        ListNode node1 = new ListNode("A",4);
        ListNode node2 = new ListNode("B",3);
        ListNode node3 = new ListNode("C",2);
        ListNode node4 = new ListNode("D",1);
        
        List list = new List();
        assertEquals(0,list.getSize());
        list.addFirst(node1);
        assertEquals(1,list.getSize());
        assertEquals("A = 4",list.toString());
        
        list.addLast(node4);
        assertEquals(2,list.getSize());
        
        ListNode node10 = list.getFirst();
        assertEquals("A = 4",node10.getData().toString());
    }

    @Test
    public void test6(){
        ListNode node1 = new ListNode("A",4);
        ListNode node2 = new ListNode("B",3);
        ListNode node3 = new ListNode("C",2);
        ListNode node4 = new ListNode("D",1);
        
        List list = new List();
        assertEquals(0,list.getSize());
        list.addFirst(node1);
        assertEquals(1,list.getSize());
        assertEquals("A = 4",list.toString());
        
        list.addLast(node4);
        assertEquals(2,list.getSize());
        
        ListNode node40 = list.getLast();
        assertEquals("D = 1",node40.toString());
        assertEquals(1,list.getSize());
    }

    @Test
    public void test7(){
        ListNode node1 = new ListNode("A",4);
        ListNode node2 = new ListNode("B",3);
        ListNode node3 = new ListNode("C",2);
        ListNode node4 = new ListNode("D",1);
        
        List list = new List();
        assertEquals(0,list.getSize());
        list.addFirst(node1);
        assertEquals(1,list.getSize());
        assertEquals("A = 4",list.toString());
        
        list.addLast(node4);
        assertEquals(2,list.getSize());
        
        ListNode node40 = list.getLast();
        assertEquals("D = 1",node40.toString());
        assertEquals(1,list.getSize());
        
        ListNode node10 = list.getFirst();
        assertEquals("A = 4",node10.toString());
        assertEquals(true,list.isEmpty());
    }
    
    @Test
    public void test8(){
        ListNode node1 = new ListNode("A",4);
        ListNode node2 = new ListNode("B",3);
        ListNode node3 = new ListNode("C",2);
        ListNode node4 = new ListNode("D",1);
        
        List list = new List();
        assertEquals(true,list.isEmpty());
        
        list.addFirst(node1);
        list.addFirst(node2);
        list.addFirst(node3);
        list.addFirst(node4);

        assertEquals(false,list.isEmpty());
        assertEquals(4,list.getSize());
        
        ListNode first = list.getFirst();
        assertEquals("A = 4",first.toString());
    }
    
        @Test
    public void test9(){
        ListNode node1 = new ListNode("A",4);
        ListNode node2 = new ListNode("B",3);
        ListNode node3 = new ListNode("C",2);
        ListNode node4 = new ListNode("D",1);
        
        List list = new List();
        assertEquals(true,list.isEmpty());
        
        list.addFirst(node1);
        list.addFirst(node2);
        list.addFirst(node3);
        list.addFirst(node4);

        assertEquals(false,list.isEmpty());
        assertEquals(4,list.getSize());
        
        ListNode last = list.getLast();
        assertEquals("D = 1",last.toString());        
    }

    @Test
    public void test10(){
        ListNode node1 = new ListNode("A",4);
        ListNode node2 = new ListNode("B",3);
        ListNode node3 = new ListNode("C",2);
        ListNode node4 = new ListNode("D",1);
        
        List list = new List();
        assertEquals(true,list.isEmpty());
        
        list.addFirst(node1);
        list.addFirst(node2);
        list.addFirst(node3);
        list.addFirst(node4);

        assertEquals(10,list.getSumOfTotalNumbers());        
    }
    
}
