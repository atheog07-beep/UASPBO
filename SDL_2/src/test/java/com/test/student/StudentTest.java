/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.sdl.*;
/**
 *
 * @author puspa
 */
public class StudentTest {
    
    public StudentTest() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @Test
    public void testStudent(){
        Student test1 = new Student("10","Adi");
        Student test2 = new Student("11","David");
        Student test3 = new Student("12","Charlie");
        Student test4 = new Student("13","Farid");
        Student test5 = new Student("14","Indah");
        
        MyStudentLarik larik = new MyStudentLarik(5);
        larik.append(0, test1);
        larik.append(1, test2);
        larik.append(2, test3);
        larik.append(3, test4);
        larik.append(4, test5);
        
        int result = larik.search("Farid");
        assertEquals(3,result);
        
        larik.nameSort();
        larik.printData();
        assertEquals("Farid",larik.getValue(4).getName());
    }
}
