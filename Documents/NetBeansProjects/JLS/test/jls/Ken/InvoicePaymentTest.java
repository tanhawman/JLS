
package jls.Ken;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class InvoicePaymentTest {
    
    int bill = 200;
    int cust = 210;
    
    public InvoicePaymentTest() {
    }
    
    @Before
    public void setUp() {
    }

    @Test
    public void testCal_Change() {
        System.out.println("Cal_Change");
        GenInvoicePayment ip = new GenInvoicePayment();
        int expResult = 10;
        int result = ip.Cal_Change(bill, cust);
        assertEquals(expResult, result, 0.1);
    }
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
    }
}
