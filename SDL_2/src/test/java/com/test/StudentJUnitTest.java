/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.sdl.Student;

/**
 *
 * @author puspa
 */
public class StudentJUnitTest {
    
    public StudentJUnitTest() {
    }
    
    @Test
    public void testStudent1() {
        //test 1
        Student test = new Student("1","Budi");
        assertEquals("1",test.getId());
        assertNotEquals("2",test.getId());
    }
    
    @Test
    public void testStudent2() {
        //test 1
        Student test = new Student("1","Puspa");
        assertEquals("Puspa",test.getName());
        assertNotEquals("not Puspa",test.getName());
    }
}
