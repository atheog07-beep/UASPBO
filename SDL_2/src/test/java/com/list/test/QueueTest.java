/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.list.test;

import com.sdl.list.ListNode;
import com.sdl.queue.Queue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author user
 */
public class QueueTest {
    
    public QueueTest() {
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
        
        Queue queue = new Queue();
        assertEquals(true,queue.isEmpty());
        queue.enqueue(node1);
        assertEquals(false,queue.isEmpty());
        assertEquals(1,queue.getSize());
    }
    
    @Test
    public void test2(){
        ListNode node1 = new ListNode("A",4);
        ListNode node2 = new ListNode("B",3);
        ListNode node3 = new ListNode("C",2);
        ListNode node4 = new ListNode("D",1);
        
        Queue queue = new Queue();
        assertEquals(true,queue.isEmpty());
        queue.enqueue(node1);
        assertEquals(false,queue.isEmpty());
        assertEquals(1,queue.getSize());
        
        queue.enqueue(node2);
        queue.enqueue(node3);
        queue.enqueue(node4);
        assertEquals(4,queue.getSize());
        
    }

    @Test
    public void test3(){
        ListNode node1 = new ListNode("A",4);
        ListNode node2 = new ListNode("B",3);
        ListNode node3 = new ListNode("C",2);
        ListNode node4 = new ListNode("D",1);
        
        Queue queue = new Queue();
        assertEquals(true,queue.isEmpty());
        queue.enqueue(node1);
        assertEquals(false,queue.isEmpty());
        assertEquals(1,queue.getSize());
        
        queue.enqueue(node2);
        queue.enqueue(node3);
        queue.enqueue(node4);
        assertEquals(4,queue.getSize());
        
        ListNode node10 = queue.dequeue();
        assertEquals("A = 4",node10.getData().toString());
    }

    @Test
    public void test4(){
        ListNode node1 = new ListNode("A",4);
        ListNode node2 = new ListNode("B",3);
        ListNode node3 = new ListNode("C",2);
        ListNode node4 = new ListNode("D",1);
        
        Queue queue = new Queue();
        assertEquals(true,queue.isEmpty());
        queue.enqueue(node1);
        assertEquals(false,queue.isEmpty());
        assertEquals(1,queue.getSize());
        
        queue.enqueue(node2);
        queue.enqueue(node3);
        queue.enqueue(node4);
        assertEquals(4,queue.getSize());
        
        ListNode node10 = queue.dequeue();
        assertEquals("A = 4",node10.getData().toString());
        
        assertEquals(6,queue.getSumOfTotalNumbers());
    }

}
