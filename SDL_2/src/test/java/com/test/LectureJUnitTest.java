/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import com.sdl.Lecture;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author puspa
 */
public class LectureJUnitTest {
    
    public LectureJUnitTest() {
    }
    
    @Test
    public void testLecture1() {
        //test 1
        Lecture test = new Lecture("1","Puspa");
        assertEquals("1",test.getId());
        assertNotEquals("2",test.getId());
    }
    
    @Test
    public void testLecture2() {
        //test 1
        Lecture test = new Lecture("1","Puspa");
        assertEquals("Puspa",test.getName());
        assertNotEquals("not Puspa",test.getName());
    }
}
