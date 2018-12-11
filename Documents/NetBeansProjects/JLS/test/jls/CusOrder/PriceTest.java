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
public class PriceTest {
    
        int p1 = 10;
        int p2 = 20;
        int p3 = 30;
        int p4 = 40;
        int p5 = 50;
        
    public PriceTest() {
    }
    
    @Before
    public void setUp() {

    }
    
    @Test
    public void testCal_Change() {
        System.out.println("Cal_total");
        double expResult = 150.0;
        int result = Integer.parseInt(Cal_total(p1, p2, p3, p4, p5));
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Price.main(args);
    }

    private String Cal_total(int p1, int p2, int p3, int p4, int p5) {
       int total = p1 + p2 + p3 + p4 + p5;
       return Integer.toString(total);
    }
}
