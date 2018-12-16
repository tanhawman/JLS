package jls.Kun;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

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
    }
    
    /**
     * Test of main method, of class SelectItem.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
    }

    private int Cal_subtotal(int price, int qty) {
        int temp = price * qty;
        return temp;
    }
    
}
