/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.sdl.Student;
/**
 *
 * @author puspa
 */
public class StudentTest2 {
    
    public StudentTest2() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @Test
    public void testStudent(){
        Student test = new Student("007","James Bond");
        System.out.println("Data = "+test);
    }
}
