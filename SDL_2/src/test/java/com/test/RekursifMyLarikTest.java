/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import com.sdl.MyLarik;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author puspa
 */
public class RekursifMyLarikTest {
    
    public RekursifMyLarikTest() {
    }
    
    @Test
    public void test1(){
        MyLarik test = new MyLarik(5);
        test.append(0,1);
        test.append(1,2);
        test.append(2,3);
        test.append(3,4);
        test.append(4,5);
        assertEquals(15,test.getLoopSum(4));
    }
    
    @Test
    public void test2(){
        MyLarik test = new MyLarik(5);
        test.append(0,1);
        test.append(1,2);
        test.append(2,3);
        test.append(3,4);
        test.append(4,5);
        assertEquals(15,test.getRekursifSum(4));
    }
}
