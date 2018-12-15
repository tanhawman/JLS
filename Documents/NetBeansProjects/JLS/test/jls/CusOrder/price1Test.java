/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jls.CusOrder;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class price1Test {
    
    public price1Test() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of Cal_total method, of class price1.
     */
    @Test
    public void testCal_total() {
        System.out.println("Cal_total");
        int p1 = 2;
        int p2 = 2;
        int p3 = 2;
        int p4 = 2;
        int p5 = 2;
        price1 instance = new price1();
        String expResult = "10";
        String result = instance.Cal_total(p1, p2, p3, p4, p5);
        assertEquals(expResult, result);

    }
    
}
