/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.sdl.MyStringLarik;
/**
 *
 * @author puspa
 */
public class MyStringLarikJUnitTest {
    
    public MyStringLarikJUnitTest() {
    }
    
    @Test
    public void testMyLarik() {
        //test 1
        MyStringLarik test = new MyStringLarik(5);
        test.append(0,"apple");
        test.append(1,"banana");
        test.append(2,"cherry");
        test.append(3,"apple");
        test.append(4,"grape");
        assertEquals("apple",test.getValue(0));
        assertNotEquals("banana",test.getValue(0));
        assertEquals("out of range",test.getValue(5));
    }
    
    @Test
    public void testMyLarik1() {
        //test 2
        MyStringLarik test = new MyStringLarik(5);
        test.append(0,"apple");
        test.append(1,"banana");
        test.append(2,"cherry");
        test.append(3,"apple");
        test.append(4,"grape");
        assertEquals(Boolean.TRUE,test.isExist("apple"));
        assertEquals(2,test.getNumbers("apple"));
    }
  

/**
 *
 * @author puspa
 */
public class MyStringLarikJUnitTest {
    
    public MyStringLarikJUnitTest() {
    }
    
    @Test
    public void testMyLarik() {
        //test 1
        MyStringLarik test = new MyStringLarik(5);
        test.append(0,"apple");
        test.append(1,"banana");
        test.append(2,"cherry");
        test.append(3,"apple");
        test.append(4,"grape");
        assertEquals("apple",test.getValue(0));
        assertNotEquals("banana",test.getValue(0));
        assertEquals("out of range",test.getValue(5));
    }

    @Test
    public void testMyLarik1() {
        //test 2
        MyStringLarik test = new MyStringLarik(5);
        test.append(0,"apple");
        test.append(1,"banana");
        test.append(2,"cherry");
        test.append(3,"apple");
        test.append(4,"grape");
        assertEquals(1,test.isExist("apple"));
        assertEquals(3,test.getNumbers("apple"));
    }
    
}
