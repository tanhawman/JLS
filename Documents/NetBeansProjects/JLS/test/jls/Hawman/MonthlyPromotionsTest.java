/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jls.Hawman;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hawma
 */
public class MonthlyPromotionsTest {
    
    public MonthlyPromotionsTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of main method, of class MonthlyPromotions.
     */
    
    @Test
    public void testOnlyDigitsInString() {
        System.out.println("Check if a string contains only digits");
        String test1 = "12345";
        String test2 = "123ab";
        boolean valid1 = true;
        boolean valid2 = true;
        
        for (int i=0; i<test1.length(); i++) {
            if (!Character.isDigit(test1.charAt(i))) {
                valid1 = false;
            }
        }
        for (int i=0; i<test2.length(); i++) {
            if (!Character.isDigit(test2.charAt(i))) {
                valid2 = false;
            }
        }
        assertTrue(valid1);
        assertFalse(valid2);
    }  
    
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MonthlyPromotions.main(args);
    }
    
}
