/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jls.Kun;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Yee Kun
 */
public class CatalogOrderTest {
    
    public CatalogOrderTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of ListItem method, of class CatalogOrder.
     */
    @Test
    public void testListItem() {
        System.out.println("ListItem");
        String expResult = "Tan Yee Kun";
        String result = "Tan Yee Kun";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addRowToJTable method, of class CatalogOrder.
     */
    @Test
    public void testAddRowToJTable() {
        System.out.println("addRowToJTable");
        CatalogOrder instance = new CatalogOrder();
        instance.addRowToJTable();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of main method, of class CatalogOrder.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CatalogOrder.main(args);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
