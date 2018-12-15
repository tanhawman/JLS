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
public class CustomerOrderTest {
    
    public CustomerOrderTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of CheckData method, of class CustomerOrder.
     */
    @Test
    public void testCheckData() {
        System.out.println("CheckData");
        CustomerOrder instance = new CustomerOrder();
        boolean expResult = true;
        boolean result = instance.CheckData();
        assertEquals(expResult, result);

    }
    
}
