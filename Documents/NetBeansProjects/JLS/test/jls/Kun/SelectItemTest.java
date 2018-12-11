/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jls.Kun;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Yee Kun
 */
public class SelectItemTest {
    
    public SelectItemTest() {
    }
    
    @Before
    public void setUp() {
    }

    @Test
    public void testCal_subtotal() {
        System.out.println("Cal_subtotal");
        int price = 55;
        int qty = 4;
        int expResult = 220;
        int result = Cal_subtotal(price, qty);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of main method, of class SelectItem.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SelectItem.main(args);
    }

    private int Cal_subtotal(int price, int qty) {
        int temp = price * qty;
        return temp;
    }
    
}
