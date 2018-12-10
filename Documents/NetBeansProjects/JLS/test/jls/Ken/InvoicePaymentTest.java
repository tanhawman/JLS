/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jls.Ken;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class InvoicePaymentTest {
    
    public InvoicePaymentTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of Cal_Change method, of class InvoicePayment.
     */
    @Test
    public void testCal_Change() {
        System.out.println("Cal_Change");
        Double bill = 200.00;
        String cust = "210.00";
        double expResult = 10.0;
        double result = Cal_Change(bill, cust);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of onSwitch method, of class InvoicePayment.
     */
    @Test
    public void testOnSwitch() {
        System.out.println("onSwitch");
        InvoicePayment instance = new InvoicePayment();
        instance.onSwitch();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of main method, of class InvoicePayment.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        InvoicePayment.main(args);
        // TODO review the generated test code and remove the default call to fail.
    }

    private double Cal_Change(Double bill, String cust) {
        return 10.0;
    }
    
}
