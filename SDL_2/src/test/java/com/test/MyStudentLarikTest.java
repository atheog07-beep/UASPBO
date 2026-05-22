/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import com.sdl.MyStringLarik;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.sdl.MyStudentLarik;
import com.sdl.Student;
/**
 *
 * @author puspa
 */
public class MyStudentLarikTest {
    
    public MyStudentLarikTest() {
    }
    
    
    @Test
    public void testMyLarik() {
        //test 1
        MyStudentLarik test = new MyStudentLarik(2);
        Student student1 = new Student("1","Puspa");
        test.append(0,student1);
        Student student2 = new Student("2","Adi");
        test.append(1,student2);
        assertEquals("Puspa",test.getValue(0).getName());
    }
    
}
